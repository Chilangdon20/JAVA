import java.util.Scanner;

public class Nombres{
  public static void main(String args[]){
   String nombre_uno = "",apellido = "";
   Scanner entrada = new Scanner(System.in);
  
   System.out.println("Bune dia , Ingresa tu nombre: ");
   nombre_uno = entrada.nextLine();
   System.out.print("Ingresa tu apellido: ");
   apellido = entrada.nextLine();

   if(nombre_uno.equals(apellido) ){
    System.out.println("Los nombres son iguales");

  }else {
    System.out.println("El nombre y apellido son diferentes");
  }
 }
}