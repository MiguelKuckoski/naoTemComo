package vo;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import extras.VeiculoType;

public abstract class Estacionamento extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Veiculo[] vagas;
	private String nome;
	private VeiculoType tipoEstacionamento;
	private Endereco endereco;
	protected ArrayList<JButton> btnVagas;
	protected Controle controle;
	protected Main main = Main.INSTANCIA;

	public Estacionamento(Endereco endereco, VeiculoType tipoVeiculo, String nome, int numeroVagas, Controle controle) {
		super();
		this.nome = nome;
		this.vagas = new Veiculo[numeroVagas];
		this.tipoEstacionamento = tipoVeiculo;
		this.endereco = endereco;
		this.controle = controle;
	}

	public Veiculo[] getVagas() {
		return vagas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public VeiculoType getTipoEstacionamento() {
		return tipoEstacionamento;
	}

	public void setTipoEstacionamento(VeiculoType tipoEstacionamento) {
		this.tipoEstacionamento = tipoEstacionamento;
	}

	protected boolean estacionar(int posicao, Usuario usuario, Estacionamento estacionamento) {
		if (vagas[posicao - 1] == null) {
			vagas[posicao - 1] = usuario.getSelectedVeiculo();
			usuario.getSelectedVeiculo().setEstacionado(estacionamento);

			controle.escreverLog(true); // escreve a entrada de um carro;

			return true;
		}

		return false;

	}

	public ArrayList<JButton> getBtnVagas() {
		if (btnVagas == null)
			btnVagas = new ArrayList<JButton>();
		return btnVagas;
	}

	public void displayValues() {
		for (int i = 0; i < getBtnVagas().size(); i++) {
			if (vagas[i] != null) {
				if (vagas[i].getPlaca() == controle.getLoggedUser().getSelectedVeiculo().getPlaca()) {
					getBtnVagas().get(i).setBackground(Color.BLUE);
				} else {
					getBtnVagas().get(i).setBackground(Color.RED);
				}
			} else {
				getBtnVagas().get(i).setBackground(Color.GREEN);
			}
		}
	}

	public void desestacionar(Veiculo selectedveiculo) {

		for (int i = 0; i < vagas.length; i++) {
			if (vagas[i] != null) {
				if (vagas[i].getPlaca() == selectedveiculo.getPlaca()) {
					vagas[i] = null;
					break;
				}
			}

		}
		selectedveiculo.atualizarUltimoEstacionamento();
		selectedveiculo.setEstacionado(null);
		controle.escreverLog(false);
	}
}