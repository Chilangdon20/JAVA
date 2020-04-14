
package suma;
import java.util.Scanner;

public class SumaMain {
    public static void main(String args[]){
      //Declaracion de objeto
      Scanner enter = new Scanner(System.in);
      //Pedimos datos
      System.out.println("Ingresa el primer numero");
      int valorUno = enter.nextInt();
      
      System.out.println("Ingresa el segundo numero");
      int valorDos = enter.nextInt();
      //indicamos que los valores se vana  enviar a la clase suma
        //Creacion de objeto
        //pasamos los datos atraves de argumetnos
      Suma values = new Suma(valorUno,valorDos);
      //mandamos a llamar al metodo que necesitamos para imprimir el resultado
      values.Imprimir();
      
    }
}
