/* 
 * Creador por : Fernando Vazquez Sanchez
 * 
 * 420082523
 * 
 * */
package Modelos;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;

public class Ventana extends JFrame implements WindowListener{
	
	// constructor que recibe un string
	public Ventana(String titulo) {
		
		// lamamos al contructor del padre con el metodo super
		super(titulo);
		
		// damos un tamaño a nuestra ventana
		setSize(500,500);
		
		
		// recibimos los elemntos de la interfaz
		addWindowListener(this);
		setBackground(Color.white);
		
	}

	// como implementamos una interfaz necestiamos todos los metodos de windows listener
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
