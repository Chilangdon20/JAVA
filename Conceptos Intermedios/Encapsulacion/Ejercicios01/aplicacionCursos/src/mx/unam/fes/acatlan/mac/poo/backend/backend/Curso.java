package mx.unam.fes.acatlan.mac.poo.backend.backend;

public class Curso {

	/*
	 * atributos
	 */
	private Integer clave;
	private Integer duracionHoras;
	private String nombreCurso;
	
	/*
	 * constructor
	 */
	public Curso(Integer clave, Integer duracionHoras, String nombreCurso) {
		this.clave = clave;
		this.duracionHoras = duracionHoras;
		this.nombreCurso = nombreCurso;
	}
	
	/*
	 * getters y setters
	 */
	public Integer getClave() {
		return clave;
	}

	public void setClave(Integer clave) {
		this.clave = clave;
	}

	public Integer getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(Integer duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	
}
