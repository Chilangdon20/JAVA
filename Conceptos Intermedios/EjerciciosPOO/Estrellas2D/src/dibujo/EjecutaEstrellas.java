package dibujo;

import java.awt.Color;

import javax.swing.JFrame;

public class EjecutaEstrellas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame("Practica POO ");
		
		Estrellas2DGraphics eg = new Estrellas2DGraphics();
		
		jf.add(eg);
		jf.setBackground(Color.blue);
		jf.setSize(400,400);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		

	}

}
