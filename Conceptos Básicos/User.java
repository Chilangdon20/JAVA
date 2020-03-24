//Importamos la libreria
import java.util.Scanner;

public class User {
   public static void main(String args[]){
     
    Scanner in =  new Scanner(System.in);
    String name = "";
    int n1 = 0, n2 = 0, r = 0;
    

    System.out.println("Cual es tu nombre");
    name = in.nextLine();
    
    System.out.println("Dame el primer valor para tu suma:");
    n1 = in.nextInt();

    System.out.println("Dame el primer valor para tu suma:");
    n2 = in.nextInt();

   r = n1 + n2;
   
   System.out.println("Bienvenido" +  name  + " el resultado de tu suma es: " + r);

  }
 }

 