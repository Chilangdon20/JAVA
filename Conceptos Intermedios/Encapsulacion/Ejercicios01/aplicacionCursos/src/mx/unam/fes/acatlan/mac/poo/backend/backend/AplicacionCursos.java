package mx.unam.fes.acatlan.mac.poo.backend.backend;

import java.util.ArrayList;
import java.util.Date;

public class AplicacionCursos {

	/**
	 * atributos
	 */
	private Integer posicionAlumnoActual;
	private Alumno alumnoAnterior;
	private Alumno alumnoSiguiente;
	private Alumno alumnoActual;
	private ArrayList<Curso> cursos;
	private ArrayList<Alumno> alumnos;
	private ArrayList<Profesor> profesores;
	
	/**
	 * constructor
	 */
	public AplicacionCursos(Integer posicionAlumnoActual, Alumno alumnoAnterior, Alumno alumnoSiguiente, Alumno alumnoActual) {
		this.posicionAlumnoActual = posicionAlumnoActual;
		this.alumnoAnterior = alumnoAnterior;
		this.alumnoSiguiente = alumnoSiguiente;
		this.alumnoActual = alumnoActual;
	}
	
	/**
	 * constructor por defecto
	 */
	public AplicacionCursos() {
		//Llenado de alumnos
		cursos=new ArrayList<Curso>();
		
		Curso cursoTmp = new Curso(101, 100, "Programaci�n 1");
		cursos.add(cursoTmp);
		
		cursoTmp = new Curso(102, 90, "Dise�o 1");
		cursos.add(cursoTmp);
		
		cursoTmp = new Curso(103, 80, "Programaci�n 2");
		cursos.add(cursoTmp);
		
		cursoTmp = new Curso(104, 70, "Redes");
		cursos.add(cursoTmp);
		
		cursoTmp = new Curso(105, 60, "Dise�o Base de datos");
		cursos.add(cursoTmp);
		
		
		//llenado de profesores
		profesores = new ArrayList<Profesor>();
		//llenar 5
		
		//llenado y alumnos
		Alumno alumnoTmp = new Alumno(new Date(), GENERO.FEMENINO, "Romina", "Rosas", "Reyes", null, null, null);
		alumnoTmp = new Alumno(new Date(), GENERO.MASCULINO, null, null, null, null, null, null);
;	}

	/**
	 * getters y setters
	 */
	public Alumno getPosicionAlumnoActual() {
		return alumnos.get(posicionAlumnoActual);
	}

	/*public void setPosicionAlumnoActual(Integer posicionAlumnoActual) {
		this.posicionAlumnoActual = posicionAlumnoActual;
	}*/

	public Alumno getAlumnoAnterior() {
		return alumnos.get(posicionAlumnoActual-1);
	}

	/*public void setAlumnoAnterior(Alumno alumnoAnterior) {
		this.alumnoAnterior = alumnoAnterior;
	}*/

	public Alumno getAlumnoSiguiente() {
		return alumnos.get(posicionAlumnoActual+1);
	}

	/*public void setAlumnoSiguiente(Alumno alumnoSiguiente) {
		this.alumnoSiguiente = alumnoSiguiente;
	}*/

	public Alumno getAlumnoActual() {
		return alumnoActual;
	}

	public void setAlumnoActual(Alumno alumnoActual) {
		this.alumnoActual = alumnoActual;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

}
