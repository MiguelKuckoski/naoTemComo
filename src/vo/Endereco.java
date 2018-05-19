package vo;

public class Endereco {
	private String rua;
	private int cep;
	private String bairro;
	private String cidade;
	private String estado;
	private int num;
	private String complemento;
	
	public Endereco() {

	}
	
	public Endereco(String rua, int num, int cep, String bairro, String estado) {
		this.rua= rua;
		this.num = num;
		this.cep = cep;
		this.bairro = bairro;
		this.estado = estado;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String string) {
		this.estado = string;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
