package co.edu.uniandes.agendatelefonica.entidades.medios;

import co.edu.uniandes.agendatelefonica.comun.Constantes;
import uk.co.jemos.podam.common.PodamStringValue;

public class MedioComunicacion {

	@PodamStringValue(length = 5)
	protected String nombreMedio;

	@PodamStringValue(length = 15)
	protected String informacionMedio;

	public MedioComunicacion() {
		// Constructor por defecto
	}

	public MedioComunicacion(String nombreMedio, String informacionMedio) {
		this.nombreMedio = nombreMedio;
		this.informacionMedio = informacionMedio;
	}

	@Override
	public String toString() {
		return this.nombreMedio + Constantes.DOS_PUNTOS + this.informacionMedio;
	}

	public String getNombreMedio() {
		return nombreMedio;
	}

	public void setNombreMedio(String nombreMedio) {
		this.nombreMedio = nombreMedio;
	}

	public String getInformacionMedio() {
		return informacionMedio;
	}

	public void setInformacionMedio(String informacionMedio) {
		this.informacionMedio = informacionMedio;
	}

}
