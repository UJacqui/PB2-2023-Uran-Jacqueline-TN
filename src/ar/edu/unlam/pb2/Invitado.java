package ar.edu.unlam.pb2;

public class Invitado extends Usuario {
	private String nombre;

	public Invitado(String email,String nombre) {
		super(email);
		this.nombre =nombre;
	}

}
