package vo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Controle {
	private List<Estacionamento> estacionamento;
	private List<Usuario> usuarios;
	private Date date = new Date();
	private Usuario loggedUser;

	public List<Estacionamento> getEstacionamento() {
		return estacionamento;
	}

	public void addEstacionamento(Estacionamento estacionamento) {
		if (this.estacionamento == null)
			this.estacionamento = new ArrayList<Estacionamento>();
		this.estacionamento.add(estacionamento);
	}

	public List<Usuario> getUsuarios() {
		if (usuarios == null) {
			usuarios = new ArrayList<Usuario>();
		}
		return usuarios;
	}

	public void addUsuarios(Usuario usuario) {
		if (usuarios == null) {
			usuarios = new ArrayList<Usuario>();
		}
		this.usuarios.add(usuario);
	}

	public void removeUsuario() {

		if (loggedUser.getSelectedVeiculo().getEstacionado() == null) {
			this.usuarios.remove(loggedUser);
			loggedUser = null;

		} else {
			JOptionPane.showMessageDialog(null, "Remova seu carro da vaga.", "WARNING", JOptionPane.WARNING_MESSAGE);
		}

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private void confPasta() {
		File pastaRaiz = new File("src/");
		if (pastaRaiz.exists() != false) {
			File pastaLogs = new File("src/pastaLogs/");
			if (pastaLogs.exists() != true) {
				pastaLogs.mkdir();
			}
		}
	}

	private void confArquivo() {
		File logsUsuario = new File("src/pastaLogs/logsUsuario.txt");
		try {
			logsUsuario.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void escreverLog(boolean control) {

		confPasta();
		confArquivo();

		String nome = loggedUser.getNome();
		String placa = loggedUser.getSelectedVeiculo().getPlaca();
		Veiculo veiculo = loggedUser.getSelectedVeiculo();

		try {

			BufferedWriter arquivo = null;
			File file = new File("src/pastaLogs/logsUsuario.txt");
			FileWriter fileWriter = new FileWriter(file, true);
			arquivo = new BufferedWriter(fileWriter);

			if (control == true) {

				arquivo.write("chegou" + ";" + nome + ";" + veiculo.getEstacionado().getNome() + ";" + placa + ";" + date + ";");
			} else {
				arquivo.write("saiu" + ";" + nome + ";" + veiculo.getUltimoEstacionamento().getNome() + ";" + placa + ";" + date + ";");
			}
			arquivo.newLine();
			arquivo.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public void escreverLog2(Usuario usuario, Estacionamento estacionamento) {

		confPasta();
		confArquivo();

		String status;
		String statuscheck = usuario.getSelectedVeiculo().getEstacionado().getNome();
		String nome = usuario.getNome();
		String placa = usuario.getSelectedVeiculo().getPlaca();
		String nomeEstacionamento = estacionamento.getNome();

		try {

			BufferedWriter arquivo = null;
			File file = new File("src/pastaLogs/logsUsuario.txt");
			FileWriter fileWriter = new FileWriter(file, true);
			arquivo = new BufferedWriter(fileWriter);

			if (statuscheck != null) {
				status = "chegou";
			} else {
				status = "saiu";
			}
			arquivo.write(status + ";" + nome + ";" + nomeEstacionamento + ";" + placa + ";" + date + ";");
			arquivo.newLine();
			arquivo.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public void lerLog() {

	}

	public Usuario getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(Usuario loggedUser) {
		this.loggedUser = loggedUser;
	}
}
