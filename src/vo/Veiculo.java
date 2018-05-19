package vo;

import extras.VeiculoType;

public class Veiculo {
	private String placa;
	private String modelo;
	private String cor;
	private int ano;
	private boolean estacionado;
	private VeiculoType tipoVeiculo;

	public Veiculo() {

	}
	
	public Veiculo(String placa, String modelo, int ano, VeiculoType tipoVeiculo) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.tipoVeiculo = tipoVeiculo;
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

	public boolean isEstacionado() {
		return estacionado;
	}

	public void setEstacionado(boolean estacionado) {
		this.estacionado = estacionado;
	}

	public VeiculoType getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(VeiculoType tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
	public void estacionar( ) {
		this.estacionado = true;
	}
	
	public void desestacionar() {
		this.estacionado = false;
	}
}
