public class Operaciones{
  public static void main(String args[]){
   //Declaramos variables 
   
   int n1 = 5, n2 = 3, r = 0;
   int p = 2;
   
   switch(p){ 
    case 1: r = n1 + n2;
    System.out.println("Resultado = " + r);
    break; 
    
    case 2: r = n1 - n2;
    System.out.println("Resultado = " + r);
    break; 
  
    case 3: r = n1 * n2;
    System.out.println("Resultado = " + r);
    break; 
    
    case 4: r = n1 / n2;
    System.out.println("Resultado = " + r);
    break; 
  
    default: System.out.println("Error , la opcion no existe");
  }
 }
}