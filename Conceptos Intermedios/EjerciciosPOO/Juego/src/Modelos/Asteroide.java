package Modelos;

public class Asteroide extends Coordenada{
	
	// atributos
	
	private float lado1=0;
	private float lado2=0;
	
	
	// constructor
	public Asteroide()
	{
		// accedemos al constructor de coordenada sin parametros
		super();
		
		// creamos el asteroide donde sus lados sean 0
		this.lado1=0;
		this.lado2=0;
	}
	
	// constructor donde va a venir lo que queremos crear
	
	public Asteroide(Coordenada coor,float x,float y) 
	{
		//llamamod al padre para que traiga las coordenadas
		super(coor);
		this.lado1 = x;
		this.lado2 = y;
		
	}
	
	// constructor de copia
	
	public Asteroide(Asteroide neww) {
		
		
		super(neww.getX(),neww.getY());
		this.lado1 = neww.lado1;
		this.lado2 = neww.lado2;
	}
	
	// get ue recibe un entero el cual nos va a retornar los lados del asteroide mediante un if
	public float Getlado(int lado)
	{
		if(lado ==1)
		{
			return this.lado1;
		}
		if(lado == 2)
		{
			return this.lado2;
		}
		
		if(lado1 != 0 && lado !=1) {
			return 0;
		}
		return 0;
	}

}
