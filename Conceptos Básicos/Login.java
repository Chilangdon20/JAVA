import java.util.Scanner;

public class Login{
  public static void main(String args[]){
    String usuario = "", pasword = "";
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingresa tu tagname:");
    usuario = entrada.nextLine();

    System.out.println("Ingresa tu pasword:");
    pasword = entrada.nextLine();
    

    if(usuario.equals("Fernando") && pasword.equals("56758062")){
 
     System.out.println("Bienvenido!!");
   }else{
      System.out.println("Contraseña incorrecta");
    }
  }
}