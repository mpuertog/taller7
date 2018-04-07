package co.edu.uniandes.agendatelefonica.entidades.medios;

public class TelefonoCelular extends MedioComunicacion {

	private String informacionLineaSecundaria;

	public TelefonoCelular(String nombreMedio, String informacionMedio) {
		this.nombreMedio = nombreMedio;
		this.informacionMedio = informacionMedio;
	}

	public String getInformacionLineaSecundaria() {
		return informacionLineaSecundaria;
	}

	public void setInformacionLineaSecundaria(String informacionLineaSecundaria) {
		this.informacionLineaSecundaria = informacionLineaSecundaria;
	}

}
