package ar.edu.unlam.pb2;

public class Organizador extends Usuario {
	
	private  String nombreOrganizador ;
	private  Integer edadOrganizador ;
	public Organizador(String email, String nombreOrganizador, Integer edadOrganizador) {
		super(email);	
		this.nombreOrganizador = "Chiqui Tapia";
		this.edadOrganizador = 55;
	}
	public String getNombreOrganizador() {
		return nombreOrganizador;
	}
	public void setNombreOrganizador(String nombreOrganizador) {
		this.nombreOrganizador = nombreOrganizador;
	}
	public Integer getEdadOrganizador() {
		return edadOrganizador;
	}
	public void setEdadOrganizador(Integer edadOrganizador) {
		this.edadOrganizador = edadOrganizador;
	}
	
	
	
	

}
