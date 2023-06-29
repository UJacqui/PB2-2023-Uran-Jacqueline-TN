package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Cumple extends Evento {
	private Usuario agasajado;
	
	public Cumple(String nombre, Usuario organizador) {
		super(nombre, organizador);
		// TODO Auto-generated constructor stub
	}

	public Usuario getAgasajado() {
		return agasajado;
	}

	public void setAgasajado(Usuario agasajado) {
		this.agasajado = agasajado;
	}

	
	
	
}
