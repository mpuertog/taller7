package co.edu.uniandes.agendatelefonica.entidades.persona;

import java.util.List;

import co.edu.uniandes.agendatelefonica.comun.Constantes;
import co.edu.uniandes.agendatelefonica.entidades.medios.MedioComunicacion;

public class Persona {

	private String nombre;

	private List<MedioComunicacion> mediosComunicacion;

	public Persona() {
		this.nombre = Constantes.ANONIMO;
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, List<MedioComunicacion> mediosComunicacion) {
		this.nombre = nombre;
		this.mediosComunicacion = mediosComunicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<MedioComunicacion> getMediosComunicacion() {
		return mediosComunicacion;
	}

	public void setMediosComunicacion(List<MedioComunicacion> mediosComunicacion) {
		this.mediosComunicacion = mediosComunicacion;
	}

}
