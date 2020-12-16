package Modelos;

public class Bala extends Coordenada {
	
	// atributos
	private float radio;
	
	public Bala() {
		super();
		this.radio=0;
	}
	
	public Bala(Coordenada neww,float r) {
		
		super(neww);
		this.radio = r;
	}
	
	public Bala(Bala bal)
	{
		super(bal);
		this.radio = bal.radio;
	}
	
	public float GetRadio()
	{
		return this.radio;
	}
	public void SetRadio(float r)
	{
		this.radio = r;
	}
	
	public Coordenada getCentro()
	{
		Coordenada neww = new Coordenada(this.getX(),this.getY());
		
		return neww;
	}

}
