package Modelos;

/* Clase padre encargada de dar posicion de la pantalla donde nosotros queremos dar el objeto que se vea en la pantalla 
 * , ya que nuestro videojiuego esta compupesto de 3 clases que heredan las coordenadas para usarse en la pantalla
 */


public class Coordenada {
	
	
	// atributos
	private float x;
	private float y;
	
	
	//-------------CONSTRUCTORES--------------------------//
	
	// constuctor que no retorna
	public Coordenada()
	{
		// nuevas coordenadas sin parametros
		this.x=0;
		this.y=0;
	}
	
	// constructor que retorna
	public Coordenada(float x,float y)
	{
		// nos retorna lasc oordenadas del usuario
		this.x = x;
		this.y = y;
	}
	
	// constructor en caso de que exista una nueva coordenada
	public Coordenada(Coordenada neww) {
		
		// coordenadas de clase porparametro
		this.x = neww.x;
		this.y = neww.y;
	}
	
	//-------------GETTERS & SETTERS--------------------------//
	
	
	// getter que nos traiga la coordenada
	public float getX()
	{
		return this.x;
	}
	
	public float getY()
	{
		return this.y;
	}
	
	
	// set que cambia losa tributos de la coordenada a modificar
	public void setX(float x)
	{
		this.x = x;
	}
	
	public void setY(float y)
	{
		this.x = y;
	}
	
	

}
