package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Casamiento extends Evento {
	private HashSet<Agasajado> agasajados = new HashSet<>();

	public void agregraAgasajados(Usuario agasajado) {
		agasajados.add((Agasajado) agasajado);

	}
	
	public Integer cantAgasajados() {
		return	agasajados.size();
	}

	

	


}
