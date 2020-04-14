
package suma;


public class Suma {
    //declaramos espacios en memoria
    private int v1,v2,r;
    //creamos un constructor con el mismo nombre donde se van a alamacenar las variables del usuario
    public Suma(int valorUno,int valorDos){
      //guardamos los valores que acabamos de recibir en variable nuevas
        this.v1 =  valorUno;
        this.v2 = valorDos;
    }
    //Creamos el metodo que nos va a hacer la suma
    public void Operacion(){
      r = v1+v2;
      
    }
    //creamos metodo para poder imprimir el restulado
    public void Imprimir(){
      //mandamos a llamar al metodo que hace la suma
      Operacion();
      System.out.println("El resultado de la suma es: " + r);
    }
}
