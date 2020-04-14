
package main;
import operaciones.ClaseHija_Mult;
import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;

public class ClasePrincipal {
    public static void main(String[] args){
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sumar();
        System.out.print("El restulado de la suma es: ");
        mensajeroSuma.MostrarResultado();
        
        
        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Resta();
        System.out.print("El resultado de la resta  es: ");
        mensajeroResta.MostrarResultado();
        
        ClaseHija_Mult mensajeroMult = new ClaseHija_Mult();
        mensajeroMult.PedirDatos();
        mensajeroMult.Mult();
        System.out.print("El restultado del producto es: ");
        mensajeroMult.MostrarResultado();
    }
}
