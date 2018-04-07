package co.edu.uniandes.agendatelefonica.entidades.medios;

public class TelefonoFijo extends MedioComunicacion {

	// Personal o Corporativo
	private String tipoTelefonoFijo;

	private String extension;

	public TelefonoFijo(String nombreMedio, String informacionMedio) {
		this.nombreMedio = nombreMedio;
		this.informacionMedio = informacionMedio;
	}

	public String getTipoTelefonoFijo() {
		return tipoTelefonoFijo;
	}

	public void setTipoTelefonoFijo(String tipoTelefonoFijo) {
		this.tipoTelefonoFijo = tipoTelefonoFijo;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

}
