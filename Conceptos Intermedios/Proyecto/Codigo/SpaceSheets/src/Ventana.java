// Esta clase nos va a permitir crear la ventana principal del juego

import javax.swing.JFrame

public class Ventana extends JFrame{
	
	// Estas dos variables son el tamaño que queremos que sea nuestra  ventana
	public static final int WIDTH = 550 , HEIGHT = 650;
	
	//Crearmos un constructor para inicializar los parametros generales de la ventana
	
	public Window() {
		
		setTitle("FuncyScape");
		setSize(WIDTH,HEIGHT);
		
		// permitimos que la ventana se pueda cerrar al momento d epresionar la X
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		// permitimos que la pantalla se despliegue al centro
		setLocationRelative()null;
		
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		
		new Ventana();
		

	}

}
