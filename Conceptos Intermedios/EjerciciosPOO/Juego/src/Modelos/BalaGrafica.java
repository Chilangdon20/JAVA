package Modelos;

import java.awt.Color;
import java.awt.Graphics;

public abstract class BalaGrafica extends Bala implements Dibujable{
	Color color;
	
	
	public BalaGrafica(Coordenada cor,float radio,Color uncolor) {
		
		super(cor,radio);
		this.color = uncolor;
	}
	
	public void dibujar(Graphics dw) {
		
		dw.setColor(color);
		dw.fillOval((int)(this.getX()-this.GetRadio()),(int)(this.getY()-this.GetRadio()), (int)(2*this.GetRadio()),(int)(2*this.GetRadio()));
		
	}

}
