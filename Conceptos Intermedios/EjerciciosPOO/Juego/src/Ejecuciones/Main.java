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
		Ventana ventana = new Ventana("PROYECTO FINAL");
		
		
		// array donde vamos a mandarlos objetos a modificar
		ArrayList ArrayObjetos = new ArrayList();
		
		// antes de ingresar el array al panel crearemos nuestro asteroide
		
		Coordenada cor1 = new Coordenada(250,250);
		AsteroideGrafica asteroide = new AsteroideGrafica(cor1,90,90,Color.red);
		
		// agregamos el asteroide  a nuestro aray para mostrarlo en el panel
		ArrayObjetos.add(asteroide);
		
		PanelF  panelfg = new PanelF(ArrayObjetos);
		
		
		// agregamos 
		ventana.add(panelfg);
		ventana.setSize(800,600);
		ventana.setVisible(true);
		
		
		

	}

}
