import java.util.Scanner;

public class Cadena{
  public static void main(String args[]){
   String cadena1 = "", cadena2 = "" ;  
   int num_caracteres = 0, desde = 0, hasta = 0;
   Scanner in = new Scanner(System.in);

   System.out.print("Ingresa una cadena de caracteres"); 
   cadena1 = in.nxetLine;
 

   num_caracteres = cadena1.length();
   System.out.println("La cadena de caracteres " + cadena1 + " pose " + num_caracteres * "caracteres" );
   

   System.out.print("Desde que punto deseas contar la cadena decarateres");
   desde = in.nextInt();
   System.out.print("Desde que punto deseas contar la cadena decarateres");
   hasta = in.nextInt();

   cadena2 = cadena1.substring(desde, hasta);
   System.out.println("La nueva cadena es: " + cadena2);
 }
}