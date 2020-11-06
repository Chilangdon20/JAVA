/**
 * 
 */
package ejemplo;

/**
 * @author fernandov
 *
 */
public class Nobel {
	
	// atributos 
	
	private String ganador;
	private String categoria;
	private int año;
	
	// metodos
	
	public void llamar()
	{
		System.out.println("El ganador es: "+ ganador);
	}
	
	// gettes y setter
	public String getGanador() {
		return ganador;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}

}
