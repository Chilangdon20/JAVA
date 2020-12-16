package Modelos;

import java.awt.Color;
import java.awt.Graphics;

// Esta clase sera la implementacion grafica de nuestro asteroide por asi decirlo el frontend

public class AsteroideGrafica extends Asteroide implements Dibujable{

	
	Color color;
	
	//--------------------CONSTRUCTOR----------------//
	
	
	
	public AsteroideGrafica(Coordenada cor, float x,float y,Color uncolor)
	{
		super(cor,x,y);
		this.color = uncolor;
		
	}
	
	
	public void dibujar(Graphics dw) {
		// TODO Auto-generated method stub
		dw.setColor(color);
		dw.fillRect((int)this.getX(),(int)this.getY(),(int)this.Getlado(1),(int)this.Getlado(2));
		
		
	}
	
	
	
	

}
