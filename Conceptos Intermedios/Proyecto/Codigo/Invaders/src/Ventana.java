// Esta clase nos va a permitir crear la ventana principal del juego

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;


public class Ventana extends JFrame implements  Runnable{
	
	// Estas dos variables son el tamaño que queremos que sea nuestra  ventana
	public static final int WIDTH = 850 , HEIGHT = 650;
	
	private Canvas canvas;
	private Thread hilo; 
	
	// con este tipo de dato booleano lo usamos en nuestro ciclo while para mantener el estado del juegi
	private boolean corriendo = false;
	
	// objetos para dibujar
	private BufferStrategy bs;
	private Graphics f;
	
	//Crearmos un constructor para inicializar los parametros generales de la ventana
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
		
		// lamamos al metodo start
		new Ventana().start();
		}
	
	// metodos de actualizar y dibujar
	int x = 0;
	private void actualizar(){
		x++;
	}
	
	private void dibujar() {
		
		bs = canvas.getBufferStrategy();
		if(bs == null)
		{
			canvas.createBufferStrategy(3);
			return;
			
		}
		
		f = bs.getDrawGraphics();
	
	    // -- empieza dibujo---
		f.clearRect(0,0,WIDTH,HEIGHT);
		f.drawRect(x,0,100,100);
		
		// -- termina dibujo---
		f.dispose();
		bs.show();
		
	}
	
	//-----------------------------
	
	
	public void run() {
		
		// ciclo while que se encarga de actualizar la poscicion de los objetos
		while(corriendo) 
		{
			actualizar();
			dibujar();
		}
		stop();
		
	}
	
	
	// metodos para iniciar y detener el thread principal
	
    private void start() {
		
		// creamos un nuevo hilo para implemetnar la clase de la interfaz
		hilo = new Thread(this);
		hilo.start();
		corriendo = true;
		
         
		
	}
	
	private void stop() {
		try {
			hilo.join();
			corriendo = false;
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}
	
	
	

}