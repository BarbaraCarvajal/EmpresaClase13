package com.unab;

/**
 * 
 */

/**
 * @author Luis Zenteno
 *
 */
public class Capacitacion {
	
	private String id, rutCliente, día, hora, lugar, duración, asistentes;
	
	public Capacitacion() {}
	
	public Capacitacion (String id, String rutCliente, String dia, String hora, String lugar, String duracion, String asistentes) {
		
		this.id = id;
		this.rutCliente = rutCliente;
		this.día = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duración = duracion;
		this.asistentes = asistentes;
		
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", rutCliente=" + rutCliente + ", día=" + día + ", hora=" + hora + ", lugar="
				+ lugar + ", duración=" + duración + ", asistentes=" + asistentes + "]";
	}
	

}
