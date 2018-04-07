package co.edu.uniandes.agendatelefonica.cliente;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.agendatelefonica.agenda.AgendaTelefonica;
import co.edu.uniandes.agendatelefonica.entidades.medios.MedioComunicacion;
import co.edu.uniandes.agendatelefonica.entidades.medios.TelefonoCelular;
import co.edu.uniandes.agendatelefonica.entidades.medios.TelefonoFijo;
import co.edu.uniandes.agendatelefonica.entidades.persona.Persona;

public class AgendaTelefonicaCliente {

	public static void main(String[] args) {
		// Crear medios de comunicación
		List<MedioComunicacion> mediosComunicacion = new ArrayList<MedioComunicacion>();
		TelefonoFijo fijo = new TelefonoFijo("Casa", "1234567");
		TelefonoCelular celular = new TelefonoCelular("Celular", "1234567890");
		mediosComunicacion.add(celular);
		mediosComunicacion.add(fijo);

		// Inicializar agenda
		AgendaTelefonica agenda = new AgendaTelefonica();
		agenda.crearContacto("Persona Prueba", mediosComunicacion);

		// Imprimir datos
		for (Persona persona : agenda.getListaPersonas()) {
			System.out.println("Nombre: " + persona.getNombre());
			System.out.println("Telefonos:");
			for (MedioComunicacion medio : persona.getMediosComunicacion()) {
				System.out.println(medio.nombreMedio + ": " + medio.informacionMedio);
			}
		}

	}
}
