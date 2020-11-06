package ejemplo;

public class Videojuego {
	// atributos
	private boolean estado;
	private String personaje;
	private int ataque;
	
	
	// metodos
	public void Atacar()
	{
		JOptionPane.showMessageDialog(null,"Personaje , ataca"+getPersonaje()
				);
	}
	// getter y setter
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getPersonaje() {
		return personaje;
	}
	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
}
