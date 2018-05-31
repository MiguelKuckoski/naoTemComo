package vo;

import javax.swing.JPanel;

import extras.VeiculoType;

public abstract class Estacionamento extends JPanel {
	private int [] vagas;
	private String nome;
	private String tipoEstacionamento;
	private Endereco endereco;
	
	public Estacionamento() {
//		String rua, int num, int cep, String bairro, String estado, String placa, String modelo, String ano,
//		VeiculoType tipoVeiculo
//		
//		TODO consertar passagem de parametros do estacionamento
		
		super();

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

	public String getTipoEstacionamento() {
		return tipoEstacionamento;
	}

	public void setTipoEstacionamento(String tipoEstacionamento) {
		this.tipoEstacionamento = tipoEstacionamento;
	}

	public void alterarEstadoVaga() {
		//TODO n�o sei como fazer isso... ainda ;)
		
	}
	
	
	
	
}
