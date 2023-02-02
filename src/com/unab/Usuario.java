package com.unab;

/**
 * 
 */

/**
 * @author Luis Zenteno
 *
 */
public class Usuario {
	
	private String nombre, fechaNac, rut;
	
	public Usuario() {}
	
	public Usuario(String nombre, String fechaNac, String rut) {
		
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.rut = rut;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNac=" + fechaNac + ", rut=" + rut + "]";
	}
	
	

}
