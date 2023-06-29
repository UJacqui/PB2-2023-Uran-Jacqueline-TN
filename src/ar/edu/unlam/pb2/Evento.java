package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Evento {
	private String nombre;
    private Usuario organizador;
    private List<Usuario> invitados;
    private HashSet<Usuario> confirmados = new HashSet<>();
    HashSet<Invitado> listaAsistencias = new HashSet<>();


	public Evento(String nombre, Usuario organizador) {
        this.nombre = nombre;
        this.organizador = organizador;
        this.invitados = new ArrayList<>();
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}

	public List<Usuario> getInvitados() {
		return invitados;
	}
	
	public void agregarInvitado(Usuario invitado) {
		invitados.add(invitado);
	}

	public void setInvitados(List<Usuario> invitados) {
		this.invitados = invitados;
	}
	
	public Integer obtenerInvitados() {
		return invitados.size();
		
	}

	public HashSet<Usuario> getConfirmados() {
		return confirmados;
	}

	public void setConfirmados(HashSet<Usuario> confirmados) {
		this.confirmados = confirmados;
	}
	
	public void agregarConfirmados(Usuario invitado) {
		confirmados.add(invitado);
	}
	
	public Integer obtenerConfirmados() {
		return confirmados.size();
		
	}
	
	public void agregarAsistencias(Usuario invitado) {
		listaAsistencias.add((Invitado) invitado);
	}
	

}
