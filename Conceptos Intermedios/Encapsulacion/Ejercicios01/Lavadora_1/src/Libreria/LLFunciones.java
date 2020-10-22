/* Clase para las funciones logicas de una lavadora*/

package Libreria;

public class LLFunciones {
	
	private int kilos = 0,llenadoCompleto = 0, TipoRopa = 0, LavadoCompleto = 0 , SecadoCompleto = 0;

	// recibir 2 valorea atraves de argumentos
	
	public LLFunciones(int kg , int TipoRopa) {
		
		
		// Recuperamos las variables 
		this.kilos = kg;
		this.TipoRopa = TipoRopa;
		
	}
	
	// Creamos el primer metodo privado para que los programadores no puedana cceder
	private void Llenado() {
		
		if(kilos <= 12){
			llenadoCompleto = 1;
			System.out.println("Llenando...");
			System.out.println("Lenado completo");
		}else {
			System.out.println("La carga de ropa es muy pesada, reduce la carga");
		}
	}
	
	// metodo de lavado
	private void Lavado(){
		Llenado();
		if(llenadoCompleto == 1) {
			if(TipoRopa == 1){
				System.out.println("Ropa blanca / Lvado suave");
				System.out.println("Lavando...");
				LavadoCompleto = 1;
			}else if(TipoRopa == 2) {
				System.out.println("La ropa es de color / lavado intenso");
				System.out.println("Lavando...");
				LavadoCompleto = 1;
			} else {
				System.out.println("Ingresa un numero valido porfavor.");
				System.out.println("Se lavara como ropa de color la opcion ingresada");
				LavadoCompleto = 1;
			}
			
			
		} else {
			System.out.println("Llenado no completado , porfaor espere.");
		}
	}
	
	// metodo de secado
	private void Secado(){
		Lavado();
		if(LavadoCompleto == 1) {
		  System.out.println("Secando...");
		  SecadoCompleto = 1;
		  
		}
	}
	
	// metodo publico
	public void CicloFinalizado() {
		Secado();
		if(SecadoCompleto == 1) {
			System.out.println("Tu ropa esta lista");
		}
		
	}
}
