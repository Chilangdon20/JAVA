public class Main
{
	public static void main(String[] args) {
   System.out.print("¿Cual es la clave del trabajador?: ");
   clave = entrada.nextInt();
   System.out.println("");

   if(clave == 1){

     if(antiguedad == 1){
       System.out.println("El trabajador " + nombre + " tiene derecho a 6 días de vacaciones");
     } else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println("El trabajador " + nombre + " tiene derecho a 14 días de vacaciones");
     } else if(antiguedad >= 7){
       System.out.println("El trabajador " + nombre + " tiene derecho a 20 días de vacaciones");
     } else {
       System.out.println("El trabajador aun no tiene derecho a vacaciones");
     }
    
   } else if(clave == 2){
 
     if(antiguedad == 1){
       System.out.println("El trabajador " + nombre + " tiene derecho a 7 días de vacaciones");
     } else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println("El trabajador " + nombre + " tiene derecho a 15 días de vacaciones");
     } else if(antiguedad >= 7){
       System.out.println("El trabajador " + nombre + " tiene derecho a 22 días de vacaciones");
     } else {
       System.out.println("El trabajador aun no tiene derecho a vacaciones");
     }
    
   } else if(clave == 3){

     if(antiguedad == 1){
       System.out.println("El trabajador " + nombre + " tiene derecho a 10 días de vacaciones");
     } else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println("El trabajador " + nombre + " tiene derecho a 20 días de vacaciones");
     } else if(antiguedad >= 7){
       System.out.println("El trabajador " + nombre + " tiene derecho a 30 días de vacaciones");
     } else {
       System.out.println("El trabajador aun no tiene derecho a vacaciones");
     }
    
   } else { 
    System.out.println("Error!, la clave de departamento es incorrecta");
    }
   }
  }
 }
}