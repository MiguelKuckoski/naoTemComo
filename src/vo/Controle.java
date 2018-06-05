package vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controle {
	private List<Estacionamento> estacionamento;
	private List<Usuario> usuarios;
	private Date date = new Date();
	private Usuario loggedUser;
	
	public List<Estacionamento> getEstacionamento() {
		return estacionamento;
	}

	public void addEstacionamento(Estacionamento estacionamento) {
		if(this.estacionamento == null)
			this.estacionamento = new ArrayList<Estacionamento>();
		this.estacionamento.add(estacionamento);
	}

	public List<Usuario> getUsuarios() {
		if(usuarios == null) {
			usuarios = new ArrayList<Usuario>();
		}
		return usuarios;
	}
	
	public void addUsuarios(Usuario usuario) {
		if(usuarios == null) {
			usuarios = new ArrayList<Usuario>();
		}
		this.usuarios.add(usuario);
	}	
	
	public void removeUsuario(Usuario usuario) {
		
		if(loggedUser.getSelectedVeiculo().getEstacionado()==null) {
			this.usuarios.remove(loggedUser);
			loggedUser=null;
		}else {
			loggedUser.getSelectedVeiculo().setEstacionado(null);
			this.usuarios.remove(loggedUser);
			loggedUser=null;
		}
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void escreverLog() {
		
	}
	
	public void lerLog() {
		
	}

	public Usuario getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(Usuario loggedUser) {
		this.loggedUser = loggedUser;
	}
}
