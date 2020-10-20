package suma;

public class Suma {
	
	/*En esta clase vndra todo el
	 * +funcionamiento interno del cooo1digo */
	
	
	//creamos espacio en memoria para nuestros datois
	
	private int v1,v2,r;
	
	// creamos un constructor
	
	public Suma(int valor1, int valor2){
		
		// guardamos los valores que trajo el objeto valores
		
		this.v1 = valor1;
		this.v2 = valor2;
	}
	// creamos un metodo que realice la suma
	public void Operacion(){
		r = v1 + v2;
	}
	
	// nuevo metodo que imprima el resultado
	public void Imprimir(){
		
		// mandamos a llaar a operacion ya que ahi se almacena el resultao
		Operacion();
		
		System.out.println("El resultado de la suma es: " + r);
	}

}