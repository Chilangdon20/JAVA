package panaderia;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class PruebaPanaderia {

	public static void main(String[] args) throws UnknownHostException {
		String alumno="";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm");
		InetAddress address = InetAddress.getLocalHost();
		Panaderia panaderia=new Panaderia();
		
		panaderia.getPanadero2().getPanesSemana()[0][4]=new Pan("concha",3,4,100,80,DIA.VIERNES);
		panaderia.getPanadero2().getPanesSemana()[1][4]=new Pan("bolillo",1.5,3,200,170,DIA.VIERNES);
		
		panaderia.getPanadero2().getPanesSemana()[0][4]=new Pan("brownie",3,4,50,49,DIA.VIERNES);
		
		panaderia.reiniciarValores();
		
		panaderia.getPanadero2().getPanesSemana()[0][0]=new Pan("concha",3,4,50,40,DIA.LUNES);
		panaderia.getPanadero2().getPanesSemana()[1][0]=new Pan("bolillo",1.5,3,100,100,DIA.LUNES);
		
		panaderia.getPanadero2().getPanesSemana()[0][6]=new Pan("concha",3,4,100,90,DIA.DOMINGO);
		panaderia.getPanadero2().getPanesSemana()[1][6]=new Pan("cuerno",3,4,100,80,DIA.DOMINGO);
		panaderia.getPanadero2().getPanesSemana()[2][6]=new Pan("cocol",3,4,150,100,DIA.DOMINGO);
		panaderia.getPanadero2().getPanesSemana()[3][6]=new Pan("bolillo",1.5,4,100,95,DIA.DOMINGO);
		
	
		panaderia.getPanadero2().getPanesSemana()[0][0]=new Pan("pay de queso",5,4,150,150,DIA.LUNES);
		panaderia.getPanadero2().getPanesSemana()[1][0]=new Pan("tarta de frutas",10,3,50,50,DIA.LUNES);
		
		panaderia.getPanadero2().getPanesSemana()[0][6]=new Pan("pay de queso",5,4,150,150,DIA.DOMINGO);
		panaderia.getPanadero2().getPanesSemana()[1][6]=new Pan("tarta de frutas",10,3,50,50,DIA.DOMINGO);
		panaderia.getPanadero2().getPanesSemana()[2][6]=new Pan("pastel tres leches",15,4,50,50,DIA.DOMINGO);
		panaderia.getPanadero2().getPanesSemana()[3][6]=new Pan("rollo de pi�a",5,4,100,100,DIA.DOMINGO);
		
		alumno=JOptionPane.showInputDialog("Ingresa tu nombre Completo");
		
		JOptionPane.showMessageDialog(null, " ============================Alumno: "+alumno.toUpperCase()+"========================="
				+"\n                  "+sdf.format(new Date())
				+"\n                  "+address.getHostName()
				+"\n **************Reporte Semanal Panaderia "+panaderia.getNombrePanaderia()+"************"
				+"\n Ganancia:                              "+panaderia.getGananciaTotal()
				+"\n Cantidad Pan Elaborado:   "+panaderia.obtenerCantidadSemanalPanElaborado()
				+"\n Cantidad pan panadero 1:  "+panaderia.getPanadero2().mostrarPanesElaboradosXDia(4)
				+"\n Cantidad pan panadero 2:  "+panaderia.getPanadero2().mostrarPanesElaboradosXDia(5));
		
		
	}

}
