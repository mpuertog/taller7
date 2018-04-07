package co.edu.uniandes.agendatelefonica.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import co.edu.uniandes.agendatelefonica.agenda.AgendaTelefonica;
import co.edu.uniandes.agendatelefonica.entidades.medios.MedioComunicacion;
import co.edu.uniandes.agendatelefonica.entidades.persona.Persona;
import co.edu.uniandes.agendatelefonica.test.util.ConstantesTest;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class AgendaTelefonicaTest {

	AgendaTelefonica agendaTelefonica;
	List<Persona> listaPersonas;
	List<MedioComunicacion> listaMedioComunicacion;
	PodamFactory podamFactory = new PodamFactoryImpl();

	@Before
	public void init() {
		agendaTelefonica = new AgendaTelefonica();
		listaPersonas = new ArrayList<Persona>();
		listaMedioComunicacion = new ArrayList<MedioComunicacion>();
	}

	@Test
	public void should_CheckAgendaTelefonicaNotNull() {
		assertNotNull(agendaTelefonica);
	}

	@Test
	public void should_havePersonas() {
		given_PersonasOnListaPersonas();
		assertTrue(ConstantesTest.NUMERO_PERSONAS == listaPersonas.size());
	}

	@Test
	public void should_PersonaHaveMedioComunicacion() {
		given_PersonasOnListaPersonas();
		given_MediosComunicacionOnListaMedioComunicacion();
		for (Persona persona : listaPersonas)
			System.out.println(persona.getMediosComunicacion());
	}

	public void given_PersonasOnListaPersonas() {
		for (int i = 0; i < ConstantesTest.NUMERO_PERSONAS; i++) {
			listaPersonas.add(podamFactory.manufacturePojo(Persona.class));
		}
	}

	public void given_MediosComunicacionOnListaMedioComunicacion() {
		for (Persona persona : listaPersonas) {
			listaMedioComunicacion = new ArrayList<MedioComunicacion>();
			MedioComunicacion medio = podamFactory.manufacturePojo(MedioComunicacion.class);
			for (int i = 0; i < ConstantesTest.NUMERO_MEDIOS_COMUNICACION; i++) {
				listaMedioComunicacion.add(medio);
			}
			persona.setMediosComunicacion(listaMedioComunicacion);
		}
	}

}
