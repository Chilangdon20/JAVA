// Esta clase nos va a permitir crear la ventana principal del juego

import javax.swing.JFrame;


import java.awt.Canvas;
import java.awt.Dimension;

public class Ventana extends JFrame Runnable{
	
	// Estas dos variables son el tamaño que queremos que sea nuestra  ventana
	public static final int WIDTH = 550 , HEIGHT = 650;
	
	private Canvas canvas;
	//Crearmos un constructor para inicializar los parametros generales de la ventana
	
	private Thread hilo; 
	public Ventana() {
		
		setTitle("FuncyScape");
		setSize(WIDTH,HEIGHT);
		
		// permitimos que la ventana se pueda cerrar al momento d epresionar la X
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// No queremos que la ventana se quiera reedimensionar mientras se ejecuta
		setResizable(false);
		
		// permitimos que la pantalla se despliegue al centro
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		// creamos un nuevo objeto de tipo canvas
		
		canvas = new Canvas();
		
		//limitamos el tamaño de nuestra figura
		canvas.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		canvas.setMaximumSize(new Dimension(WIDTH,HEIGHT));
		canvas.setMinimumSize(new Dimension(WIDTH,HEIGHT));
		
		// nos permite recibir entraadas del usuario
		canvas.setFocusable(true);
		// agregamos el canvas a la ventana
		
		add(canvas);
		
		
	}
	

	public static void main(String[] args) {
		
		new Ventana();
		

	}
	
	public void run() {
		
		
		stop();
		
	}
	
	private void start() {
		
		hilo = new Thread(this);
		hilo.start();
		
	}
	
	private void stop() {
		
		
		hilo.join();
	}
	
	
	// metodos para iniciar y terminar nuestro hilo
	private void start();
	private void stop();

}
