// package ejercicios;

//Importo todos los elementos de la biblioteca time , esto para poder jugar con las fechas.

import java.time.*; 

//Biblioteca para pedir datos al usuario
import java.util.Scanner; 




public class Main
{
	public static void main(String[] args) {
	    
	    // Entrada del usuario: aaaa-mm-dd
	    Scanner scnr = new Scanner(System.in);
	    System.out.println("Hola :D , ingresa una fecha en formato aaaa-mm-dd: "); // Print original input
	    // Almacenamos la variable como String
	    String data = scnr.next(); 
	    
	    // Convertimos de tipo string a fecha 
		LocalDate FechaCumpleaños = LocalDate.parse(data);
		
		
		// Obtenemos la fecha actual para el calculo de la edad.
		LocalDate fechaActual = LocalDate.now(); 
		
		
		// Obtenemos la diferencia entre las 2 fechas
		Period dife = Period.between(fechaActual, FechaCumpleaños);
		
		
		// Aíslamos la cantidad de años para obtener el formato de edad adecuado
		int edad  = Math.abs(dife.getYears()); 
     
        System.out.println("La fecha  que ingresaste es: " + data + " al día de hoy tienes: " + edad + " años  adelante , la vida sigue."); // Print their age
	}
}
