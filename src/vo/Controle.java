package vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
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

	private void confPasta() { //função cria a pasta de logs se possível
		File pastaRaiz = new File("src/");
		if (pastaRaiz.exists() != false) {
			File pastaLogs = new File("src/pastaLogs/");
			if (pastaLogs.exists() != true) {
				pastaLogs.mkdir();
			}
		}
	}

	private void confArquivo() { //função cria o txt de logs se possível
		File logsUsuario = new File("src/pastaLogs/logsUsuario.txt");
		try {
			logsUsuario.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void escreverLog(boolean control) { //função que escreve em LogsUsuario.txt

		confPasta();
		confArquivo();

		String nome = loggedUser.getNome();
		String placa = loggedUser.getSelectedVeiculo().getPlaca();
		Veiculo veiculo = loggedUser.getSelectedVeiculo();
		String estacionamentoCorrigido = "";

		//laço corrige o excesso de caracteres na leitura de logs
		if (control == true) {
			if ((veiculo.getEstacionado().getNome().equalsIgnoreCase("Estacionamento Principal"))) {
				estacionamentoCorrigido = "Principal";
			} else if ((veiculo.getEstacionado().getNome().equalsIgnoreCase("Estacionamento Motos"))) {
				estacionamentoCorrigido = "Motos";
			} else if ((veiculo.getEstacionado().getNome().equalsIgnoreCase("Estacionamento dos Fundos"))) {
				estacionamentoCorrigido = "Fundos";
			}
		} else {
			if ((veiculo.getUltimoEstacionamento().getNome().equalsIgnoreCase("Estacionamento Principal"))) {
				estacionamentoCorrigido = "Principal";
			} else if ((veiculo.getUltimoEstacionamento().getNome().equalsIgnoreCase("Estacionamento Motos"))) {
				estacionamentoCorrigido = "Motos";
			} else if ((veiculo.getUltimoEstacionamento().getNome().equalsIgnoreCase("Estacionamento dos Fundos"))) {
				estacionamentoCorrigido = "Fundos";
			}
		}

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String dataFormatada = formato.format(date);
		
		try { 

			BufferedWriter arquivo = null;
			File file = new File("src/pastaLogs/logsUsuario.txt");
			FileWriter fileWriter = new FileWriter(file, true);
			arquivo = new BufferedWriter(fileWriter);

			if (control == true) { //controle administra chegada e saida
				arquivo.write("chegou" + ";" + nome + ";" + estacionamentoCorrigido + ";" + placa + ";" + dataFormatada + ";");
			} else {
				arquivo.write("saiu" + ";" + nome + ";" + estacionamentoCorrigido + ";" + placa + ";" + dataFormatada + ";");
			}
			
			arquivo.newLine();
			arquivo.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	private boolean lerPasta() { //função checa se a pasta existe
		File pastaRaiz = new File("src/");
		if (pastaRaiz.exists() != false) {
			return true;
		}
		return false;
	}

	private boolean lerArquivo() {//função verifica se o txt existe
		File logsUsuario = new File("src/pastaLogs/logsUsuario.txt");
		if (logsUsuario.exists() != false) {
			return true;
		}
		return false;
	}
	
	/*
	 * Função a baixo lê o log de acordo com o que foi passado como parâmetro,
	 * e adiciona ao ArrayList a ser retornado:
	 * "todos" = Retorna todos os dados do usuário;
	 * "principal" = Retorna todos os dados do estacionamento principal;
	 * "motos" = Retorna todos os dados do estacionamento de motos;
	 * "fundos" =Retorna todos os dados do estacionamento fundos;
	 */

	public ArrayList<String[]> lerLog(String funcao) {

		ArrayList<String[]> arrayList = new ArrayList<String[]>();

		boolean checkPasta = lerPasta();
		boolean checkArquivo = lerArquivo();

		if ((checkPasta == true) && (checkArquivo == true)) { //laço verifica se arquivo e pasta existem
			try {
				File logsUsuario = new File("src/pastaLogs/logsUsuario.txt");
				FileReader fileReader = new FileReader(logsUsuario);
				BufferedReader arquivo = new BufferedReader(fileReader);
				String linha = "";

				while ((linha = arquivo.readLine()) != null) {
					String aux[] = linha.split(";");

					switch (funcao) {
					case "todos":
						if (loggedUser.getNome().equalsIgnoreCase(aux[1])) {
							arrayList.add(aux);
						}
						break;
					case "principal":
						if ((aux[2].equalsIgnoreCase("Principal"))
								&& (loggedUser.getNome().equalsIgnoreCase(aux[1]))) {
							arrayList.add(aux);
						}
						break;

					case "motos":
						if ((aux[2].equalsIgnoreCase("Motos"))
								&& (loggedUser.getNome().equalsIgnoreCase(aux[1]))) {
							arrayList.add(aux);
						}
						break;

					case "fundos":
						if ((aux[2].equalsIgnoreCase("Fundos"))
								&& (loggedUser.getNome().equalsIgnoreCase(aux[1]))) {
							arrayList.add(aux);
						}
						break;
					}

				}
				arquivo.close();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, e);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Você ainda não possui registro de estacionamentos anteriores", "Erro",
					0);
		}
		return arrayList;
	}
	
	public Usuario getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(Usuario loggedUser) {
		this.loggedUser = loggedUser;
	}
}
