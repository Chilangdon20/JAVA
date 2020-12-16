package dibujo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

import javax.swing.JPanel;

public class Estrellas2DGraphics extends JPanel{
	
	public void paintComponent(Graphics h) {
		
		super.paintComponent(h);
		
		Random aleatorio = new Random();
		
		int puntoX[] = {43,77,45,65,32};
		int puntoY[] = {0,32,76,44,32,54};
		
		Graphics2D g2d = (Graphics2D) h;
		GeneralPath gp = new GeneralPath();
		gp.moveTo(puntoX[0],puntoY[0]);
		
		for(int cont=1;cont<puntoX.length;cont++) 
			gp.lineTo(puntoX[cont],puntoY[cont]);
			gp.closePath();
			
			g2d.translate(200,200);
			
			for(int contt=1;contt<=20;contt++) {
				
				g2d.rotate(Math.E/Math.PI*21);
				
				
				g2d.setColor(new Color(aleatorio.nextInt(256),aleatorio.nextInt(256),aleatorio.nextInt(256)));
				
				g2d.fill(gp);
			}
			
		}
		
	}
	


