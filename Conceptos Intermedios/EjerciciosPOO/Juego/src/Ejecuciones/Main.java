/* 
 * Creador por : Fernando Vazquez Sanchez
 * 
 * 420082523
 * 
 * */

package Ejecuciones;


// importamos el paquete que utilizaremos
import Modelos.*;

import java.awt.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		
		// creamos un objeto para dibujar la ventana
		Ventana nuestraventana = new Ventana("PROYECTO FINAL");
		
		
		// array donde vamos a mandarlos objetos a modificar
		ArrayList ArrayObjetos = new ArrayList();
		
		// antes de ingresar el array al panel crearemos nuestro asteroide
		
		Coordenada cor1 = new Coordenada(250,250);
		Coordenada cor2 = new Coordenada(350,350);
		AsteroideGrafica asteroide = new AsteroideGrafica(cor1,80,80,Color.red);
		BalaGrafica balaa = new BalaGrafica(cor2,50,Color.black);
		// agregamos el asteroide  a nuestro aray para mostrarlo en el panel
		ArrayObjetos.add(asteroide);
		ArrayObjetos.add(balaa);
		
		PanelF  panelfg = new PanelF(ArrayObjetos);
		
		
		// agregamos 
		nuestraventana.add(panelfg);
		nuestraventana.setSize(800,600);
		nuestraventana.setVisible(true);
		
		
		

	}

}
