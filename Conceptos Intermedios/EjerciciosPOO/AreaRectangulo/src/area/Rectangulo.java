package area;

public class Rectangulo {
	
	private int base , altura , area;
	// Creacion del constructor
	
	public Rectangulo(int base , int altura) {
		
		/* Hacemos uso de la palabra this para
		   poder llamar a nuestras variables de esta clase 
		   y asignarles el valor
		   de la clase principal*/
		
		
		this.base = base;
		this.altura = altura;
		
		
		
		
	}
	public void CalculoArea() {
		
		area = base * altura;
	}
	
	public void Imprimir() {
		
		CalculoArea();
		
		System.out.print("El area es: " + area);
	
	}

}
