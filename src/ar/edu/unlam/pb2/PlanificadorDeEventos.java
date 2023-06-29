package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PlanificadorDeEventos {
	HashSet<Usuario> listaUsuarios = new HashSet<>();
	HashSet<Agasajado> listaAgasajados = new HashSet<>();
	HashSet<Evento> listaEventos = new HashSet<>();
	
	
	

	public void crear(Usuario organizador, Evento evento) {
		
		listaEventos.add(evento);	
		evento.setOrganizador(organizador);
		
		 
	}

	public void invitar(Cumple evento, Organizador organizador) {
		//agregar listaInvitados a evento
		
	}

	public Integer getCantidadDeEventos() {
		return listaEventos.size();
	}

	public void agregarAgasajado(Cumple cumple, Usuario agasajado) {
		
		cumple.setAgasajado(agasajado);
		
	}

	public void agregarAgasajados(Casamiento casamiento, Usuario agasajado1, Usuario agasajado2) {
		casamiento.agregraAgasajados(agasajado1);
		casamiento.agregraAgasajados(agasajado2);
		
	}

	public void agregarInvitados(Usuario invitado, Evento cumple) {
		cumple.agregarInvitado(invitado);
	}

	public Integer cantInvitados(Evento cumple) {
		return cumple.obtenerInvitados();
	}

	public Boolean confirmarParticipacion(Usuario invitado1, Evento cumple) {
		
		List<Usuario> invitados = cumple.getInvitados();
		
		if(cumple.getConfirmados().contains(invitado1)) {
			return false;
		}
		
		for (Usuario usuario : invitados) {
			if (usuario.getEmail() == invitado1.getEmail()) {
				cumple.agregarConfirmados(invitado1);
				return true;
			}			
		}
		return false;
	}

	public Integer cantAsistencias(Evento cumple) {
		return cumple.obtenerConfirmados();
	}

	
	public boolean marcarAsistencia(Evento cumple, Invitado invitado) throws UsuarioNoInvitadoException {
		
		if (cumple.getInvitados().contains(invitado)) {
			cumple.agregarAsistencias(invitado);
			return true;
		}else {
			throw new UsuarioNoInvitadoException("no fue invitado");
		}
	}

	public void cancelarParticipacion(Usuario invitado, Evento cumple) {
			cumple.getInvitados().remove(invitado);
	}

	

	

	

	
	


	
	
	

}
