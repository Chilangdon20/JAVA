
package polimorfismo;
import java.util.Scanner;                                //Imporatmos libreria
public abstract class Operaciones_ClasePadre {         
    protected int valor1,valor2,r;                       //declaramos variables
    Scanner entrada = new Scanner(System.in);            //Declaracion de objeto
    
    public void PedirDatos(){                            //Declaracion de metodo1
        System.out.print("Ingresa el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.print("Ingresa el segundo valor: ");
        valor2 = entrada.nextInt();
        
    }
    
    public abstract void Operaciones();                   // polimorfmismo
            
    public void MostrarRestultado(){                      // Mostramos el resultado de la operacion
        System.out.print(r);
        
        
    }
}
