/**
 * 
 */
package ejemplo;

/**
 * @author fernandov
 *
 */
public class Tarea {
	
	// atributos
	
	private String tema;
	private int calificacion;
	private String ID;
	
	
	public void llamado()
	{
		JOptionPane.showMessageDialog(null,"tema: "+getTema()+
				"\n calificacion: "+getCalificacion()+
				"\n ID: "+getID()
				);
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	

}
