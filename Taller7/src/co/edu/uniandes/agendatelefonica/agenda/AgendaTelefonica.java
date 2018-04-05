package co.edu.uniandes.agendatelefonica.agenda;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.agendatelefonica.medios.MedioComunicacion;

public class AgendaTelefonica {
	
	private List<MedioComunicacion> agendaTelefonica = new ArrayList<>();

	public List<MedioComunicacion> getAgendaTelefonica() {
		return agendaTelefonica;
	}

	public void setAgendaTelefonica(List<MedioComunicacion> agendaTelefonica) {
		this.agendaTelefonica = agendaTelefonica;
	}

}
