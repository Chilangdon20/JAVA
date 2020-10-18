package ejercicios;

//Importo todos los elementos de la biblioteca time , esto para poder jugar con las fechas.


import java.time.*; 
import java.util.Scanner; 
import java.util.GregorianCalendar;
import java.util.Calendar;
public class Cumple
{
	public static void main(String[] args) {
		
		
		GregorianCalendar tiempo = new GregorianCalendar();
		int year = tiempo.get(Calendar.YEAR);
		int mes = tiempo.get(Calendar.DAY_OF_MONTH);
		int dia = tiempo.get(Calendar.DAY_OF_WEEK);
		
		
        // Verificamos que cada componente de la fecha sea de tipo entero.		
		if (year == (int)year && mes == (int)mes && dia == (int)dia) {
			
		/*if (year == (int)year & mes == (int)mes & dia == (int)dia)*/	
			
				
				// Entrada del usuario: aaaa-mm-dd
			    Scanner scnr = new Scanner(System.in);
			    System.out.println("Hola :D , ingresa una fecha en formato aaaa-mm-dd: "); 
			    // Almacenamos la variable como String
			    String dob = scnr.next(); 
			    
			    // Convertimos de tipo string a fecha 
				LocalDate FechaCumpleaños = LocalDate.parse(dob);
				
				
				// Obtenemos la fecha actual para el calculo de la edad.
				LocalDate currDate = LocalDate.now(); 
				
				
				// Obtenemos la diferencia entre las 2 fechas
				Period period = Period.between(currDate, FechaCumpleaños);
				
				
				// Aíslamos la cantidad de años para obtener el formato de edad adecuado
				int age  = Math.abs(period.getYears()); 
		     
		        System.out.println("La fecha  que ingresaste es: " + dob + " al día de hoy tienes: " + age + " años  adelante , la vida sigue."); 
				
			
			
		}
		else {
			System.out.println("Los datos ingresados no son de tipo entero, porfavor ingresa datos validos.");
		}
		      
	    
	    
	}
}
