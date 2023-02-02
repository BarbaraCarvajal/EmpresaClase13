package com.unab;

/**
 * 
 */

/**
 * @author Luis Zenteno
 *
 */
public class Cliente {

	public Cliente(){}
	
	private String rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private String sistemaSalud;
	private String direccion;
	private String comuna;
	private String edad;
	
	public Cliente(String rut, String nombres, String apellidos, String telefono, String afp, String sistemaSalud,String direccion, String comuna, String edad){
	
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", edad=" + edad + "]";
	}

}
