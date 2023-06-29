package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Cumple extends Evento {
	
	private Usuario agasajado;
	HashSet<Invitado>listaDeInvitados = new HashSet<>();

	public Cumple(Usuario agasajado) {
		this.agasajado= agasajado;
	}

	public void agregarInvitados(Usuario invitado) {
		listaDeInvitados.add((Invitado) invitado);
		
	}
	
	public Integer cantidadDeInvitados() {
		return listaDeInvitados.size();
		
	}

	
}
