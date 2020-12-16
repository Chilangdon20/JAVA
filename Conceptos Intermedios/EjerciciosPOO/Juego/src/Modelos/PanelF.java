/* 
 * Creador por : Fernando Vazquez Sanchez
 * 
 * 420082523
 * 
 * */
package Modelos;

// importamos libreria necesaria

import java.awt.*;

import java.util.ArrayList;

import javax.swing.JPanel;



// clase hija del jdk
public class PanelF extends JPanel{
    
	
	// Definimos un array donde vendran los objetos a dibujar de nuestro videojuego
	ArrayList v;
	
	// definimos un constructor que recibe una lista
	public PanelF(ArrayList asd)
	{
		this.v = asd;
	}
	
	
	// Metodo que deibuja un obejto a medida que recorre el array
	
	public void paint(Graphics g)
	{
		Dibujable dib;
		
		// mientras que estemos recoriendoel array de objetos , lo dibujaremos
		for(int j = 0;j<v.size();j++) {
			
			
			// casteamos el objeto dibujable para que sea dibujado
			dib = (Dibujable)v.get(j);
		}
	}

}
