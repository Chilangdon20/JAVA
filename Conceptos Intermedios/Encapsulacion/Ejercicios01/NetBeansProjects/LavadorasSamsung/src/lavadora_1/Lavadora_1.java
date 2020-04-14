
package lavadora_1;
//importamos la biblioteca que acabamos de crear "LLFunciones"
import funciones.LLFunciones;
// importamos la biblioteca para pedir datos por teclado
import java.util.Scanner;
/**
 *
 * @author FernandoV
 */
public class Lavadora_1 {
    //declaramos metodo main para poder iniciar la lavadora
    public static void main(String[] args){
        //Declaramos un obejto de tipo scanner que nos permita tomar valores desde teclado
        Scanner enter = new Scanner(System.in);
        /*imprimimos mensajes en pantallla
        Inicia simulacion de lavadora*/
        System.out.println("¿La ropa es de color blanco o de algun otro color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa color");
        //creamos una variable podemos observar que no nos detecta la varible creada en la classe LLFunciones ya que esta encaplsulada de manera privada
        int TipoDeRopa = enter.nextInt();
        //creamos otro system para preguntar cuantos kilos de ropa va a ingresar el usuario
        System.out.println("¿Cuantos kilos de ropa vas a ingresar?");
        int kilos = enter.nextInt();
        
        //Creamos la instancia de clases , recordemos que la instancia es cuando dos clases se comunican entre si.
          //creamos un objeto para que se pueda comunicar con la clase
          LLFunciones mensajero = new LLFunciones(kilos,TipoDeRopa);
          mensajero.setTipoDeRopa(2);
          System.out.println("El tipo de ropa es: "+ mensajero.getTipoDeRopa());
          //mandamos a llamar al unico metodo disponible
          mensajero.CicloFinalizado();
    }
}
