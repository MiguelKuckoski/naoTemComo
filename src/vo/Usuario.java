package vo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nome;
	private String cpf;
	private String cnh;
	private List<Veiculo> veiculos;
	private String senha;
	private Veiculo selectedVeiculo;
	private Endereco endereco;
	
	public Usuario( ) {
		super();
	}
	
	public Usuario(String rua, int num, int cep, String bairro, String estado, String nome, String cpf, String cnh, String senha) {
		
		this.endereco.setRua(rua);
		this.endereco.setNum(num);
		this.endereco.setCep(cep);
		this.endereco.setBairro(bairro);
		this.endereco.setEstado(estado);
		
		this.nome = nome;
		this.cpf = cpf;
		this.cnh = cnh;
		this.senha = senha;
	}
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCnh() {
		return cnh;
	}


	public void setCnh(String cnh) {
		this.cnh = cnh;
	}


	public List<Veiculo> getVeiculos() {
		if(veiculos == null)
			veiculos = new ArrayList<Veiculo>();
		return veiculos;
	}


	public void setVeiculos(List<Veiculo> veiculos) {
		if(veiculos == null)
			veiculos = new ArrayList<Veiculo>();
		this.veiculos.addAll(veiculos);
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
//
//	public void inserirVeiculo(Veiculo veiculo) {
//		veiculos.add(veiculo);
//	}
	
	public void removerVeiculo(Veiculo veiculo) {
		veiculos.remove(veiculo);
	}

	public Veiculo getSelectedVeiculo() {
		return selectedVeiculo;
	}

	public void setSelectedVeiculo(Veiculo selectedVeiculo) {
		this.selectedVeiculo = selectedVeiculo;
	}
}
