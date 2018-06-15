package vo;

import extras.VeiculoType;

public class Veiculo {
	private String placa;
	private String modelo;
	private String cor;
	private int ano;
	private VeiculoType tipoVeiculo;
	private Estacionamento estacionamento;
	private Estacionamento ultimoEstacionamento;

	public Veiculo() {

	}
	
	public Veiculo(String placa, String modelo, int ano, VeiculoType tipoVeiculo, String cor) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.tipoVeiculo = tipoVeiculo;
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Estacionamento getEstacionado() {
		return estacionamento;
	}

	public void setEstacionado(Estacionamento estacionamento) {
		this.estacionamento = estacionamento;
	}
	
	public VeiculoType getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(VeiculoType tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
	public Estacionamento getUltimoEstacionamento() {
		return ultimoEstacionamento;
	}

	public void atualizarUltimoEstacionamento() {
		this.ultimoEstacionamento = estacionamento;
	}
	
	
	
}
