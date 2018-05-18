package vo;

import extras.VeiculoType;

public class Estacionamento extends Endereco {
	private int [] vagas;
	private String nome;
	private String tipoEstacionamento;
	
	public Estacionamento(String rua, int num, int cep, String bairro, String placa, String modelo, String ano,
			VeiculoType tipoVeiculo) {
		super(rua, num, cep, bairro, estado);

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
		//TODO não sei como fazer isso... ainda ;)
		
	}
	
	
	
	
}
