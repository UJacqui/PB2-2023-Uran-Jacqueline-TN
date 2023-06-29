package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testEventos {


	@Test
	public void queSePuedaCrearUnCumpleanios() {
		// Preparaci�n
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		
		Usuario organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Cumple cumple = new Cumple("cumple de lio", organizador);
		
		// Ejecuci�n
		principal.agregarAgasajado(cumple,agasajado);
		principal.crear(organizador,cumple);
		
		Integer cantidadDeCumpleaniosEsperados =1;
		Integer cumpleObtenido = principal.getCantidadDeEventos();
//		
		assertEquals(cantidadDeCumpleaniosEsperados, cumpleObtenido);

	}
	@Test
	public void queSePuedaCrearUnCasamiento() {
		// Preparaci�n
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		
		Usuario organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado1 = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Usuario agasajado2 = new Agasajado("mari@maria.com","maria",36);
		Casamiento casamiento = new Casamiento("casamiento", organizador);
		// Ejecuci�n
		principal.agregarAgasajados(casamiento,agasajado1, agasajado2);
		principal.crear(organizador,casamiento);
		
		Integer cantidadDeCasamientosEsperados =1;
		Integer casamientoObtenido = principal.getCantidadDeEventos();
		
		assertEquals(cantidadDeCasamientosEsperados, casamientoObtenido);
		}
	
	@Test
	public void queSePuedaInvitarGenteAUnCumpleanios() {
		// Preparaci�n
		PlanificadorDeEventos principal = new PlanificadorDeEventos();

		Organizador organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Usuario invitado1 = new Invitado("chiquitapia@afa.com","lucas");
		Usuario invitado2 = new Invitado("maria@afa.com", "maria");
		Usuario invitado3 = new Invitado("aurora@afa.com", "aurora");

		Cumple cumple = new Cumple("cumple de lio", organizador);
		
		principal.crear(agasajado, cumple);
		principal.agregarInvitados(invitado1,cumple);
		principal.agregarInvitados(invitado2,cumple);
		principal.agregarInvitados(invitado3,cumple);

		Integer valorEsperado =3;
		Integer valorObtenido = principal.cantInvitados(cumple);
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queUnInvitadoPuedaConfirmarSuAsistencia() {
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos();

		Organizador organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Usuario invitado1 = new Invitado("chiquitapia@afa.com","lucas");
		Usuario invitado2 = new Invitado("maria@afa.com", "maria");
		Usuario invitado3 = new Invitado("aurora@afa.com", "aurora");

		Cumple cumple = new Cumple("cumple de lio", organizador);
		
		principal.crear(agasajado, cumple);
		principal.agregarInvitados(invitado1,cumple);
		principal.agregarInvitados(invitado2,cumple);
		principal.agregarInvitados(invitado3,cumple);
		principal.confirmarParticipacion(invitado1,cumple);
		
		Integer valorEsperado =1;
		Integer valorObtenido = principal.cantAsistencias(cumple);
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queUnInvitadoPuedaAsistirAUnEvento() throws UsuarioNoInvitadoException {
		PlanificadorDeEventos principal = new PlanificadorDeEventos();

		Organizador organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Usuario invitado1 = new Invitado("chiquitapia@afa.com","lucas");
		Usuario invitado2 = new Invitado("maria@afa.com", "maria");
		Usuario invitado3 = new Invitado("aurora@afa.com", "aurora");

		Cumple cumple = new Cumple("cumple de lio", organizador);
		
		principal.crear(agasajado, cumple);
		principal.agregarInvitados(invitado1,cumple);
		principal.agregarInvitados(invitado2,cumple);
		principal.agregarInvitados(invitado3,cumple);
		principal.confirmarParticipacion(invitado1,cumple);
//En el momento en el que el evento se produce, los invitados marcan su asistencia.
		
		Boolean valorObtenido = principal.marcarAsistencia(cumple,(Invitado) invitado1); 
		
		assertTrue(valorObtenido);
		
	}
	
	@Test(expected = UsuarioNoInvitadoException.class)
	public void queSiUnInvitadoAsisteAUnEventoAlQueNoFueInvitadoLanceLaExcepcionUsuarioNoInvitado() throws UsuarioNoInvitadoException {
		PlanificadorDeEventos principal = new PlanificadorDeEventos();

		Organizador organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Usuario invitado1 = new Invitado("chiquitapia@afa.com","lucas");
		Usuario invitado2 = new Invitado("maria@afa.com", "maria");
		Usuario invitado3 = new Invitado("aurora@afa.com", "aurora");
		Usuario invitado4 = new Invitado("noInvitado@afa.com", "marcela");

		Cumple cumple = new Cumple("cumple de lio", organizador);
		
		principal.crear(agasajado, cumple);
		principal.agregarInvitados(invitado1,cumple);
		principal.agregarInvitados(invitado2,cumple);
		principal.agregarInvitados(invitado3,cumple);
		principal.confirmarParticipacion(invitado1,cumple);
//En el momento en el que el evento se produce, los invitados marcan su asistencia.
		
		 principal.marcarAsistencia(cumple,(Invitado) invitado4); 
		
	}
	
	@Test
	public void queSepuedaInvitarGenteAUnCasamiento() {
		// Preparaci�n
		PlanificadorDeEventos principal = new PlanificadorDeEventos();

		Organizador organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Usuario invitado1 = new Invitado("chiquitapia@afa.com","lucas");
		Usuario invitado2 = new Invitado("maria@afa.com", "maria");
		Usuario invitado3 = new Invitado("aurora@afa.com", "aurora");

		Casamiento casamiento = new Casamiento("casamiento", organizador);
		
		principal.crear(agasajado, casamiento);
		principal.agregarInvitados(invitado1,casamiento);
		principal.agregarInvitados(invitado2,casamiento);
		principal.agregarInvitados(invitado3,casamiento);

		Integer valorEsperado =3;
		Integer valorObtenido = principal.cantInvitados(casamiento);
		
		assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void queSePuedaCancelarUnaInvitacion() {
		PlanificadorDeEventos principal = new PlanificadorDeEventos();

		Organizador organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Usuario invitado1 = new Invitado("chiquitapia@afa.com","lucas");
		Usuario invitado2 = new Invitado("maria@afa.com", "maria");
		Usuario invitado3 = new Invitado("aurora@afa.com", "aurora");

		Cumple cumple = new Cumple("cumple de lio", organizador);
		
		principal.crear(agasajado, cumple);
		principal.agregarInvitados(invitado1,cumple);
		principal.agregarInvitados(invitado2,cumple);
		principal.agregarInvitados(invitado3,cumple);
		
		principal.cancelarParticipacion(invitado1,cumple);
		
		Integer valorEsperado =2;
		Integer valorObtenido = principal.cantInvitados(cumple);
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queNoPuedaConfirmarDosVecesSuAsistencia() {
		PlanificadorDeEventos principal = new PlanificadorDeEventos();

		Organizador organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Usuario invitado1 = new Invitado("chiquitapia@afa.com","lucas");

		Cumple cumple = new Cumple("cumple de lio", organizador);
		
		principal.crear(agasajado, cumple);
		principal.agregarInvitados(invitado1,cumple);

		Boolean valorEsperado = principal.confirmarParticipacion(invitado1,cumple);
		
		assertTrue(valorEsperado);
	}
	

}
