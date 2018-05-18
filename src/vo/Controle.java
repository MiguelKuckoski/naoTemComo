package vo;

import java.util.Date;
import java.util.List;

public class Controle {
	private List<Estacionamento> estacionamento;
	private List<Usuario> usuarios;
	private Date date = new Date();
	
	public List<Estacionamento> getEstacionamento() {
		return estacionamento;
	}

	public void setEstacionamento(Estacionamento estacionamento) {
		this.estacionamento.add(estacionamento);
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void criarUsuario() {
		
	}
	
	public void removerUsuario() {
		
	}
	
	public void escreverLog() {
		
	}
	
	public void lerLog() {
		
	}
}
