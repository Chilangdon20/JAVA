/**
 * 
 */
package ejemplo;

/**
 * @author fernandov
 *
 */
public class ProgramaInformatico {
	
	// atributos
	
	private String titulo;
	private int version;
	private String acercade;
	
	public void llamao()
	{
		JOptionPane.showMessageDialog(null,"titutlo: "+getTitulo());
	}

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAcercade() {
		return acercade;
	}
	public void setAcercade(String acercade) {
		this.acercade = acercade;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	

}
