package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;

public class PlanificadorDeEventos {
	private Integer cantidadDeUsuariosEsperados;
	private Integer cantidadDeEventosEsperados ; 
	private Integer	cantidadDeCumpleaniosEsperados ; 
	private Integer	cantidadDeCasamientosEsperados ;
	HashSet<Usuario> listaUsuarios = new HashSet<>();
	HashSet<Agasajado> listaAgasajados = new HashSet<>();
	HashSet<Evento> listaEventos = new HashSet<>();
	
	
	public PlanificadorDeEventos(Integer cantidadDeUsuariosEsperados,Integer cantidadDeEventosEsperados, Integer cantidadDeCumpleaniosEsperados,
			Integer cantidadDeCasamientosEsperados) {
		super();
		this.cantidadDeUsuariosEsperados = cantidadDeUsuariosEsperados;
		this.cantidadDeEventosEsperados = cantidadDeEventosEsperados ;
		this.cantidadDeCumpleaniosEsperados = cantidadDeCumpleaniosEsperados;
		this.cantidadDeCasamientosEsperados = cantidadDeCasamientosEsperados;
	}

	public Integer getCantidadDeUsuariosEsperados() {
		return cantidadDeUsuariosEsperados;
	}

	public void setCantidadDeUsuariosEsperados(Integer cantidadDeUsuariosEsperados) {
		this.cantidadDeUsuariosEsperados = cantidadDeUsuariosEsperados;
	}

	public Integer getCantidadDeEventosEsperados() {
		return cantidadDeEventosEsperados;
	}

	public void setCantidadDeEventosEsperados(Integer cantidadDeEventosEsperados) {
		this.cantidadDeEventosEsperados = cantidadDeEventosEsperados;
	}

	public Integer getCantidadDeCumpleaniosEsperados() {
		return cantidadDeCumpleaniosEsperados;
	}

	public void setCantidadDeCumpleaniosEsperados(Integer cantidadDeCumpleaniosEsperados) {
		this.cantidadDeCumpleaniosEsperados = cantidadDeCumpleaniosEsperados;
	}

	public Integer getCantidadDeCasamientosEsperados() {
		return cantidadDeCasamientosEsperados;
	}

	public void setCantidadDeCasamientosEsperados(Integer cantidadDeCasamientosEsperados) {
		this.cantidadDeCasamientosEsperados = cantidadDeCasamientosEsperados;
	}

	public void agregarOrganizadorAlEvento(Usuario organizador) {
		this.listaUsuarios.add(organizador);
	}

	public void agregraAgasajados(Usuario agasajado) {
		this.listaAgasajados.add((Agasajado) agasajado);
		
	}

	public void crear(Usuario organizador, Evento evento) {

		if (listaAgasajados.size() == 1) {
			
			listaEventos.add(evento);//cumple
			cantidadDeCumpleaniosEsperados++;
			
		} else {
			cantidadDeCumpleaniosEsperados=0;
		}
		
		if (listaAgasajados.size() == 2) {
			listaEventos.add(evento);//casamiento
			cantidadDeCasamientosEsperados ++;
			
		} else {
			cantidadDeCasamientosEsperados = 0;
		}
	}

	public void invitar(Cumple evento, Organizador organizador) {
		//agregar listaInvitados a evento
		
	}

	

	

	

	
	


	
	
	

}
