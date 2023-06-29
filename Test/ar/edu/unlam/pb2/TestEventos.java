package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEventos {

	@Test
	public void queSePuedaCrearUnCumpleanios() {
		// Preparaci�n
		Integer cantidadDeUsuariosEsperados =2;
		Integer cantidadDeEventosEsperados=0;
		Integer cantidadDeCumpleaniosEsperados=0;
		Integer cantidadDeCasamientosEsperado=0;
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos(cantidadDeUsuariosEsperados,cantidadDeEventosEsperados,cantidadDeCumpleaniosEsperados,cantidadDeCasamientosEsperado);
		
		Usuario organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Cumple evento = new Cumple(agasajado);
		
		// Ejecuci�n
		principal.agregarOrganizadorAlEvento(organizador);
		principal.agregraAgasajados(agasajado);
		principal.crear(organizador,evento);
		
		Integer cumpleCreadoEsperado =1;
		Integer cumpleObtenido = principal.getCantidadDeCumpleaniosEsperados();
		
		
	
		// Validaci�n
		assertEquals(cumpleCreadoEsperado,cumpleObtenido);
		
//		assertEquals(cantidadDeUsuariosEsperados, principal.getCantidadDeUsuarios());
//		assertEquals(cantidadDeEventosEsperados, principal.getCantidadDeEventos());
//		assertEquals(cantidadDeCumpleaniosEsperados, principal.getCantidadDeCumpleanios());
//		assertEquals(new Usuario(mailOrganizador, nombreOrganizador, edadOrganizador), principal.getEvento("El cumple de Lionel Messi").getOrganizador());
//		assertEquals(cantidadDeCasamientosEsperados, principal.getCantidadDeCasamientos());
	}
	@Test
	public void queSePuedaCrearUnCasamiento() {
		// Preparaci�n
		Integer cantidadDeUsuariosEsperados =2;
		Integer cantidadDeEventosEsperados=0;
		Integer cantidadDeCumpleaniosEsperados=0;
		Integer cantidadDeCasamientosEsperado=0;
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos(cantidadDeUsuariosEsperados,cantidadDeEventosEsperados,cantidadDeCumpleaniosEsperados,cantidadDeCasamientosEsperado);
		
		Usuario organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario maria = new Agasajado("maria@.com","maria",36);
		Usuario pablo = new Agasajado("pablo@.com","pablo",36);

		Casamiento evento = new Casamiento();
		
		// Ejecuci�n
		principal.agregarOrganizadorAlEvento(organizador);
		principal.agregraAgasajados(maria);
		principal.agregraAgasajados(pablo);
		principal.crear(organizador,evento);
		
		Integer casamientoCreadoEsperado =1;
		Integer casamientoObtenido = principal.getCantidadDeCasamientosEsperados();
		

		// Validaci�n
		
		assertEquals(casamientoCreadoEsperado, casamientoObtenido);
	}
	
	@Test
	public void queSePuedaInvitarGenteAUnCumpleanios() {
		// Preparaci�n
		Integer cantidadDeUsuariosEsperados =2;
		Integer cantidadDeEventosEsperados=0;
		Integer cantidadDeCumpleaniosEsperados=0;
		Integer cantidadDeCasamientosEsperado=0;
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos(cantidadDeUsuariosEsperados,cantidadDeEventosEsperados,cantidadDeCumpleaniosEsperados,cantidadDeCasamientosEsperado);
		
		Organizador organizador = new Organizador("chiquitapia@afa.com", "Chiqui Tapia", 55);
		Usuario agasajado = new Agasajado("lio@Messi.com","Lionel Messi",36);
		Usuario invitado1 = new Invitado("chiquitapia@afa.com","lucas");
		Usuario invitado2 = new Invitado("maria@afa.com", "maria");
		Usuario invitado3 = new Invitado("aurora@afa.com", "aurora");

		Cumple evento = new Cumple(agasajado);
		
		principal.crear(agasajado, evento);
		evento.agregarInvitados(invitado1);
		evento.agregarInvitados(invitado2);
		evento.agregarInvitados(invitado3);

//		principal.invitar(evento,organizador);
		
		
	
		// Ejecuci�n
//		PlanificadorDeEventos principal = new PlanificadorDeEventos();
//		principal.add(new Usuario(mailOrganizador, nombreOrganizador, edadOrganizador));
//		principal.add(new Usuario("kunaguero@kunisports.com", "Sergio Aguero", 36));
//		principal.add(new Usuario("kmbappe@second.com", "Kylian Mbapee", 24));
//		Usuario organizadorDelEvento = principal.getUsuario(mailOrganizador);
//		Cumple elCumpleDeLeo = new Cumple((Agasajado)new Usuario(mailAgasajado, nombreAgasajado, edadAgasajado));
//		principal.crear(organizadorDelEvento, elCumpleDeLeo);
//		principal.invitar(elCumpleDeLeo, new Usuario("kunaguero@kunisports.com", "Sergio Aguero", 36));
//		principal.invitar(elCumpleDeLeo, new Usuario("kmbappe@second.com", "Kylian Mbapee", 24));
//		
//		// Validaci�n
//		assertEquals(cantidadDeUsuariosEsperados, principal.getCantidadDeUsuarios());
//		assertEquals(cantidadDeInvitadosEsperados, principal.getCantidadDeInvitados());
	}
	

}
