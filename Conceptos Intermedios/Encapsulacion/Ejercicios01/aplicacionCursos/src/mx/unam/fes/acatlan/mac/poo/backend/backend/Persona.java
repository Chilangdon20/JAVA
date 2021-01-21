package mx.unam.fes.acatlan.mac.poo.backend.backend;

import java.util.Date;

import javax.swing.JOptionPane;



public class Persona {
	
	/*
	 *atributos 
	 **/
		protected Date fechaNac;
		protected GENERO genero;
		protected String nombre;
		protected String paterno;
		protected String materno;
	
	/*
	 *metodos
	 **/
	void imprimirDatos() {

		JOptionPane.showMessageDialog(null, "Fecha de Nacimiento: " + fechaNac+
				"Genero: " + genero +
				"Nombre: " + nombre +
				"Apellido Paterno: " + paterno +
				"Apellido Materno: "+ materno);
	}
	
	/*
	 * Constructor
	 **/
	public Persona(Date fechaNac, GENERO genero, String nombre, String paterno, String materno){
		this.fechaNac = fechaNac;
		this.genero = genero;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
	}

	/*
	 * Getters y Setters
	 **/
	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public GENERO getGenero() {
		return genero;
	}

	public void setGenero(GENERO genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

}
