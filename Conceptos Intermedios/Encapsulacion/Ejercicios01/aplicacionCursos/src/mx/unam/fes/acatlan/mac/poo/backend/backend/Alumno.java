package mx.unam.fes.acatlan.mac.poo.backend.backend;

import java.util.Date;

public class Alumno extends Persona{
	
	/*
	 * atributos
	 */
		private String foto;
		private String promedio;
		private String cuenta;
	
	
	/*
	 * constructor
	 */
		public Alumno(Date fechaNac, GENERO genero, String nombre, String paterno, String materno, String foto, String promedio, String cuenta) {
			super(fechaNac, genero, nombre, paterno, materno);
			super.fechaNac = fechaNac;
			super.genero = genero;
			super.nombre = nombre;
			super.paterno = paterno;
			super.materno = materno;
			this.foto = foto;
			this.promedio = promedio;
			this.cuenta = cuenta;
		}
	
	/*
	 * metodos
	 */
		public void registrarurso(Curso curso) {
			
		}
		
		public void eliminarCurso() {
			
		}
		
		 public void agregarTutor(Profesor profesor) {
			
		}
		
		public void eliminarTutor() {
			
		}

	/*
	 * getters y setters
	 */
		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public String getPromedio() {
			return promedio;
		}

		public void setPromedio(String promedio) {
			this.promedio = promedio;
		}

		public String getCuenta() {
			return cuenta;
		}

		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
	
	
		
}
