/**
 * 
 */
package ejemplo;

import javax.swing.JOptionPane;

/**
 * @author fernandov
 *
 */
public class Fiesta {
	
	private String nombre;
	private int invitados;
	private String playlist;
	
	
	// metodo
	
	public void mostrar()
	{
		JOptionPane.showMessageDialog(null,"Nombre: "+getNombre()+
				"\n invitados: "+getInvitados()+
				"\n playlist: "+getPlaylist()
				);
	}
	
	// get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getInvitados() {
		return invitados;
	}
	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	public String getPlaylist() {
		return playlist;
	}
	public void setPlaylist(String playlist) {
		this.playlist = playlist;
	}
	

}
