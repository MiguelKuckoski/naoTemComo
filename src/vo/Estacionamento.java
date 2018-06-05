package vo;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import extras.VeiculoType;

public abstract class Estacionamento extends JPanel {
	private Veiculo[] vagas;
	private String nome;
	private VeiculoType tipoEstacionamento;
	private Endereco endereco;

	public Estacionamento(Endereco endereco, VeiculoType tipoVeiculo, String nome, int numeroVagas) {
		super();
		this.nome = nome;
		this.vagas = new Veiculo[numeroVagas];
		this.tipoEstacionamento = tipoVeiculo;
		this.endereco = endereco;

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
			return true;
		}

		return false;

	}

}
