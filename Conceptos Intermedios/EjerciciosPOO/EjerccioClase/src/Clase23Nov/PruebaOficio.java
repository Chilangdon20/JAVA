package Clase23Nov;

import javax.swing.JOptionPane;

public class PruebaOficio {

	public static void main(String[] args) {
		
		Oficio oficio1 = new Oficio();
		Oficio oficio2 = new Oficio();
		Oficio oficio3 = new Oficio();
		
		oficio1.setAsunto("Examen");
		oficio2.setAsunto("Resultado");
		oficio3.setAsunto("Diego");
		
		
		
		JOptionPane.showMessageDialog(null,"Oficio 1 folio ")+oficio1.getFolioOficio()+
		;

	}

}
