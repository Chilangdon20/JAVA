package mx.unam.fes.acatlan.mac.poo.backend.backend;

import java.util.Date;

import javax.swing.JOptionPane;

public class Profesor extends Persona{

	/**
	 * atributos
	 */
	private Integer noTrabajador;
	private String cedula;
	
	/**
	 * metodos
	 */	
	void imprimirDatos() {
		JOptionPane.showMessageDialog(null, "No. Trabajador: " + noTrabajador+
				"Cedula: " + cedula );
		super.imprimirDatos();
	}

	
	/**
	 * Constructor
	 */
	public Profesor(Date fechaNac, GENERO genero, String nombre, String paterno, String materno, Integer noTrabajador, String cedula) {
		super(fechaNac, genero, nombre, paterno, materno);
		super.fechaNac = fechaNac;
		super.genero = genero;
		super.nombre = nombre;
		super.paterno = paterno;
		super.materno = materno;
		this.noTrabajador = noTrabajador;
		this.cedula = cedula;
	}
	
	/**
	 * Getters y Setters
	 */
	public Integer getNoTrabajador() {
		return noTrabajador;
	}

	public void setNoTrabajador(Integer noTrabajador) {
		this.noTrabajador = noTrabajador;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
