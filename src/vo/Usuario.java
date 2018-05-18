package vo;

import java.util.List;

public class Usuario extends Endereco{

	private String nome;
	private long cpf;
	private long cnh;
	private List<Veiculo> veiculos;
	private String senha;
	
	
	public Usuario(String rua, int num, int cep, String bairro, String nome, long cpf, long cnh, String senha) {
		super(rua, num, cep, bairro, estado);
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


	public long getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	public long getCnh() {
		return cnh;
	}


	public void setCnh(long cnh) {
		this.cnh = cnh;
	}


	public List<Veiculo> getVeiculos() {
		return veiculos;
	}


	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void inserirVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	
	public void removerVeiculo(Veiculo veiculo) {
		veiculos.remove(veiculo);
	}
}
