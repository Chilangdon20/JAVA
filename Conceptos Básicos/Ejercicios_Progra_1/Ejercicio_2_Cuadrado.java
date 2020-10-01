package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2_Cuadrado {
	
	public static void main(String[] args) {
		
		// Crear objeto que permita ingresar datos por teclado.
		
		Scanner pedirDato = new Scanner(System.in);
		
		System.out.println("Ingresa el tamaño de tu cuadrado:");
		
		// Crear variable donde almacenamos el dato del usuario
		
		int dato = pedirDato.nextInt();
		
		// Para crear un cuadrado de tamaño razonable solamente estara entre [0,200]
		if(dato >= 0 && dato <= 200) {
			 
            // PARTE SUPERIOR DEL CUADRADO
			
			for(int a = 0; a<dato;a++) {
				System.out.print("*");
			}
			
			// PARTE INTERMEDIA DEL CUADRADO
			
			System.out.println();
			
			// CENTRO DEL CUADRADO
			
			for(int a =0; a<dato-2;a++) {
				System.out.print("*");
				
				// ESPACIOS
				for(int x=0;x < dato-2;x++){
					
					System.out.print(" ");
				}
				System.out.println("*");
			}
			
			// PARTE INFERIOR DEL CUADRADO
			
			for(int a = 0; a<dato;a++) {
				System.out.print("*");
			}
	  }
		else {
			System.out.print("Ingresa un nuumero entre el rango porfavor.");
		}
	}
}
