package vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controle {
	private List<Estacionamento> estacionamento;
	private static List<Usuario> usuarios;
	private Date date = new Date();
	private static Usuario loggedUser;
	
	public List<Estacionamento> getEstacionamento() {
		return estacionamento;
	}

	public void setEstacionamento(Estacionamento estacionamento) {
		this.estacionamento.add(estacionamento);
	}

	public static List<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(Usuario usuario) {
		if(usuarios == null) {
			usuarios = new ArrayList<Usuario>();
		}
		Controle.usuarios.add(usuario);
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

	public static Usuario getLoggedUser() {
		return loggedUser;
	}

	public static void setLoggedUser(Usuario loggedUser) {
		Controle.loggedUser = loggedUser;
	}
}
