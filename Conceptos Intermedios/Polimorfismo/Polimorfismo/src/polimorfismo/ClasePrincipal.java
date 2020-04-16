package polimorfismo;


public class ClasePrincipal {
    public static void main(String[] args){
        
        Operaciones_ClasePadre mensajeroSuma = new Suma_Hija();           //Indicamos que el mensajero tenga interaccion con el metodo suma:hija atraves del polimorfismo
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Operaciones();
        mensajeroSuma.MostrarRestultado();
        
        Operaciones_ClasePadre mensajeroResta = new Resta_Hija();
        mensajeroResta.PedirDatos();
        mensajeroResta.Operaciones();
        mensajeroResta.MostrarRestultado();
    }
}
