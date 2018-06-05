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
	

	public Usuario() {
		super();
		endereco = new Endereco();
	}

	public Usuario(String rua, int num, int cep, String bairro, String estado, String nome, String cpf, String cnh,
			String senha) {
		endereco = new Endereco();
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

	public void setCep(int cep) {
		this.endereco.setCep(cep);
	}
	public void setRua(String rua) {
		this.endereco.setRua(rua);
	}

	public void setNum(int num) {
		this.endereco.setNum(num);
	}

	public void setBairro(String bairro) {
		this.endereco.setBairro(bairro);
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setComplemento(String complemento) {
		this.endereco.setComplemento(complemento);
	}

	public void setCidade(String cidade) {
		this.endereco.setCidade(cidade);
	}

	public void setEstado(String estado) {
		this.endereco.setEstado(estado);
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
		if (veiculos == null)
			veiculos = new ArrayList<Veiculo>();
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		if (this.veiculos == null) {
			this.veiculos = new ArrayList<Veiculo>();
		}
		this.veiculos.addAll(veiculos);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

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
