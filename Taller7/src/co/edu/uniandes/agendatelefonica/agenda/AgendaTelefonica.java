package co.edu.uniandes.agendatelefonica.agenda;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.agendatelefonica.entidades.medios.MedioComunicacion;
import co.edu.uniandes.agendatelefonica.entidades.persona.Persona;

public class AgendaTelefonica {

	private List<Persona> listaPersonas = new ArrayList<Persona>();

	public void crearContacto(String nombre, List<MedioComunicacion> mediosComunicacion) {
		listaPersonas.add(new Persona(nombre, mediosComunicacion));
	}

	public void borrarContacto(Persona persona) {
		listaPersonas.remove(persona);
	}

	public List<Persona> buscarContacto(String criterioBusqueda) {
		List<Persona> resultados = new ArrayList<Persona>();
		// Buscar por nombre
		for (Persona persona : listaPersonas) {
			if (persona.getNombre().contains(criterioBusqueda))
				resultados.add(persona);
		}
		// Buscar por numero
		for (Persona persona : listaPersonas) {
			for (MedioComunicacion medio : persona.getMediosComunicacion()) {
				if (medio.getInformacionMedio().contains(criterioBusqueda))
					resultados.add(persona);
			}
		}
		return resultados;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

}
