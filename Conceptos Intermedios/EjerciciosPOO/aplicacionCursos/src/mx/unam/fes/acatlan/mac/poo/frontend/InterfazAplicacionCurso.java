package mx.unam.fes.acatlan.mac.poo.frontend;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;

public class InterfazAplicacionCurso extends JFrame {
	
	private PanelDatos PanelDatos;
	
	private PanelRegistro PanelRegistro;
	
	private PanelNavegacion PanelNavegacion;
	
	
	// Contructor que mostrara la pantalla
	
	public InterfazAplicacionCurso()
	{
		setTitle("Aplicacion Cursos");
		setSize(700,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		
		PanelDatos = new PanelDatos();
		PanelRegistro = new PanelRegistro();
		PanelNavegacion = new PanelNavegacion();
		
		add(PanelDatos,BorderLayout.NORTH);
		add(PanelRegistro,BorderLayout.CENTER);
		add(PanelNavegacion,BorderLayout.SOUTH);
	}
	
	
	
	public static void main(String[] args) {
		
		
		InterfazAplicacionCurso interfaz = new InterfazAplicacionCurso();
		// mostramos nuestra interfaz
		interfaz.setVisible(true);
		
	
		
		
	}
}
