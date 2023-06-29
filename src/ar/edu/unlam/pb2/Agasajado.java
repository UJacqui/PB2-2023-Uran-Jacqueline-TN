package ar.edu.unlam.pb2;

public class Agasajado extends Usuario {
	private String nombreAgasajado ;
	private Integer edadAgasajado ;
	public Agasajado(String email, String nombreAgasajado, Integer edadAgasajado) {
		super(email);
	
		this.nombreAgasajado = nombreAgasajado;
		this.edadAgasajado = edadAgasajado;
	}

	public String getNombreAgasajado() {
		return nombreAgasajado;
	}
	public void setNombreAgasajado(String nombreAgasajado) {
		this.nombreAgasajado = nombreAgasajado;
	}
	public Integer getEdadAgasajado() {
		return edadAgasajado;
	}
	public void setEdadAgasajado(Integer edadAgasajado) {
		this.edadAgasajado = edadAgasajado;
	}

	

}
