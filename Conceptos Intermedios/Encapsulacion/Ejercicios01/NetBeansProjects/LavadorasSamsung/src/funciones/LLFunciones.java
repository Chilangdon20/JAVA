/*
Clase para las funciones lgicas de una lavadora
*/
package funciones;

/*
FernandoV
*/
public class LLFunciones {
    //Declaramos variables que son necesarias para el funcionamiento de la computadora encapsulamos las variables 
    private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0,LavadoCompleto = 0,SecadoCompleto = 0;
    
    //creamos un constructor , declaracion de variables que va a recibir desde otra clase
    public LLFunciones(int kilos, int TipoDeRopa){
        //hacemos referencia a las variables que van a  ser llamadas desde otra clase
        this.kilos = kilos;
        this.TipoDeRopa =  TipoDeRopa;
    }
    //Agregamos el encapsulamientode manera privada  de los metodos
    private void Llenado(){
        //Agreamos estructura condicional con las especifiaciones que nos dio la empresa para su lavadora
        if(kilos <= 12){
            //Si se cumple esta condicion automaticamente nuestro "llenadoCompleto cambia a 1 ", que significa que se lleno completamente
            llenadoCompleto = 1;
            System.out.println("LLENANDO...");
            System.out.println("Lenado Completo.");
        }else{
            System.out.println("La carga de ropa excede el total de soporte de este equipo, reduce la carga");
        }
    }
    //Creamos el siguiente metodo
    private void Lavado(){
        //Observemos que primero encesitamos saber si la lavadora se lleno para poder seguir este paso , ya que si se lleno comenzara a lavar en otro caso no
        if(llenadoCompleto == 1){
            //Agreamos otro condicional para saber de que color es la ropa
            if(TipoDeRopa == 1){
                System.out.println("Ropa blanca / Lavado Suave");
                System.out.println("Lavando...");
                 LavadoCompleto = 1;
            }
        }else if(TipoDeRopa == 2){
            System.out.println("Ropa de color / lavado intensto");
             System.out.println("Lavando...");
             LavadoCompleto = 1;
        }else{
            System.out.println("El tipo de ropa no esta disponible.");
             System.out.println("Se lavara como ropa de color.");
             LavadoCompleto = 1;
        }
    }
    //Declaramos el siguiente metodo
    private void Secado(){
        //Mnadmos a llamar al ultimo metodo para saber como se lavo y si se lavo la ropa
        Lavado();
        if(LavadoCompleto == 1 ){
             System.out.println("Secando");
             SecadoCompleto = 1;
        }
    }
    //Este metodo sera el unico al cual se podra tener acceso con la funcion public
    public void CicloFinalizado(){
        //Agregamos funcionalidades 
        Secado();
        if(SecadoCompleto == 1){
             System.out.println("Proceso de Lavado Completo,poravor retira tu ropa.");
        }
    }

    public void setTipoDeRopa(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTipoDeRopa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
