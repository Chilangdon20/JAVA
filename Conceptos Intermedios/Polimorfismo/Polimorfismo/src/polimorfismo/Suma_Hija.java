
package polimorfismo;


public class Suma_Hija extends Operaciones_ClasePadre{
    
    @Override                                              //Indicamos que vamos a sobreescribir un metodo
    public void Operaciones(){                             //Metodo sobreescrito ie aqui viene la parte logica del programa
        r = valor1 + valor2;
    }
}
