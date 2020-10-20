package suma;
import java.util.Scanner;


public class SumaMain {

	/* En esta seccion solamente vendra el codigo para pedirle 
	 * los datos al usuario */
   public static void main(String[] args) {
	   
	   // Creamos nuevo objeto
	   
	   Scanner entrada = new Scanner(System.in);
	   
	   System.out.println("Dame el primer valor: ");
	   // declaramos el valor uno
	   int valor1 = entrada.nextInt();
	   
	   
	   // declaramos el valor dos
	   System.out.println("Dame el primer valor: ");
	   int valor2 = entrada.nextInt();
	   
	   // Creamos un objeto de tipo suma para poder comunicar nuestras variables con Suma
	   
	   Suma valores = new Suma(valor1,valor2);
	   
	   // mandamos a llamar al metodo imprimir
	   valores.Imprimir();
	   
	   
   }
}
