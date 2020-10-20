package area;
import java.util.Scanner;

public class RectanguloMain {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dame el valor de la base: ");
		
		int base = entrada.nextInt();
		
		System.out.print("Dame el valor de la altura: ");
		int altura = entrada.nextInt();

		// Creacion del objeto para la instancia de clase.
		
		Rectangulo mensajero = new Rectangulo(base,altura);
		
		mensajero.Imprimir();
		
		
	}

}
