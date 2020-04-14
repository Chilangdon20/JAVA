
package area;

//importamos las bibliotecas necesarias
import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args){
        //Creamos objeto de tipo scanner
        Scanner enter = new Scanner(System.in);
        //solicitamos datos desde teclado
        System.out.print("Dame el valor de la base: ");
        int base = enter.nextInt();
        System.out.print("Dame el valor de la altura");
        int altura = enter.nextInt();
        //Indicamos los valores que se vana  evaluar en la clase Rectangulo:
        Rectangulo mensajero = new Rectangulo(base,altura);
        //madnamos a llamar los metodos 
        mensajero.Imprimir();
    }
}
