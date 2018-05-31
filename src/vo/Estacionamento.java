package vo;

import javax.swing.JPanel;

import extras.VeiculoType;

public abstract class Estacionamento extends JPanel {
	private int [] vagas;
	private String nome;
	private VeiculoType tipoEstacionamento;
	private Endereco endereco;
	
	public Estacionamento(Endereco endereco,VeiculoType tipoVeiculo,String nome,int numeroVagas) {
		super();
		this.nome = nome;
		this.vagas = new int[numeroVagas];
		this.tipoEstacionamento = tipoVeiculo;
		this.endereco = endereco;
		
	}

	public int [] getVagas() {
		return vagas;
	}

	public void setVagas(int [] vagas) {
		this.vagas = vagas;
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

	public void alterarEstadoVaga() {
		//TODO n�o sei como fazer isso... ainda ;)
		
	}
	
	
	
	
}
