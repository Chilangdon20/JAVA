public class Promedio{
  public static void main(String args[]){
   
     int mate = 10;
     int bio  = 10;
     int est  = 9;
     int promedio = 0;

     promedio = (mate + bio + est) / 3;
     
     if(promedio >= 6){
   
    System.out.println("Genial aprobaste con : " + promedio);
  } else {
    System.out.println("Lo siento no aprobaste: " + promedio);  
  }
 }
}