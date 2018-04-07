package co.edu.uniandes.agendatelefonica.entidades.medios;

public class CorreoElectronico extends MedioComunicacion {

	// Personal o Corporativo
	private String tipoCorreo;

	public CorreoElectronico(String nombreMedio, String informacionMedio) {
		super(nombreMedio, informacionMedio);
		this.nombreMedio = nombreMedio;
		this.informacionMedio = informacionMedio;
	}

	public String getTipoCorreo() {
		return tipoCorreo;
	}

	public void setTipoCorreo(String tipoCorreo) {
		this.tipoCorreo = tipoCorreo;
	}

}
