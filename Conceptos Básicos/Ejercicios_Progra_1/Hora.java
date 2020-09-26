package hora_1;

// Importamos las clases a utilizar
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

// Iniciamos nuestra clase principal
public class Hora {
	
 public static void main(String[] args) {
	 
  // Creamos una variable tiempo donde obtendremos las horas y los minutos de la clase Calendar , utlizando GregorianCalendar
	 
  GregorianCalendar tiempo = new GregorianCalendar();
  
  // Declaramos nuestras dos variables de interes hora del dia & minutos
  
  
  int hora = tiempo.get(Calendar.HOUR_OF_DAY);
  int minuto = tiempo.get(Calendar.MINUTE);
  
  // Pedir nombre al usuario.
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Ingresa tu nombre: ");
  
  String nombre = sc.nextLine();
  
  
  // Iniciamos condicional
  
  // Si la hora es menor que 12 imprime buenos dias
  
  if (hora < 12) System.out.println("Buenos dias! " + nombre + ", la hora es: " + hora+ ":"+ minuto);
  
  // Si la hora esta entre las 5 pero es diferente de las 12 imprimime buenas tardes.
  
  
  else if (hora < 17 && !(hora == 12)) System.out.println("Buenas tardes " + nombre + ", la hora es: " + hora + ":"+ minuto);
  
  // Si la hora es igual a las 12 imprime buen medio dia 
  else if (hora == 12) System.out.println("Buen medio dia "+ nombre + ", la hora es: " + hora + ":"+ minuto);
  
  // Cualquier otro caso imprime buenas noches
  else System.out.println("Buenas noches " + nombre + ", hora de dormir: "+ hora + ":"+ minuto);
	 
    }
}
