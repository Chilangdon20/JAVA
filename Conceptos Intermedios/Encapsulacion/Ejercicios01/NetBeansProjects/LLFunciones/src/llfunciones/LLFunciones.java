
/*
 * Clase para las funciones logicas de una lavadora
 */
package llfunciones;

/**
 *
 * @author Fernando
 */
public class LLFunciones {
    
    private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;
    
    public LLFunciones(int kilos, int TipoDeRopa){
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    }
    private void Llenado(){
        if(kilos <= 12){
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("LLenado completo.");
        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }
    private void Lavado(){ //Este método sirve para lavar
        Llenado();
        if(llenadoCompleto == 1){
            switch (TipoDeRopa) {
                case 1:
                    System.out.println("Ropa balnca / Lavado suave");
                    System.out.println("Lavando...");
                    LavadoCompleto = 1;
                    break;
                case 2:
                    System.out.println("Ropa de color / lavado intenso");
                    System.out.println("Lavando...");
                    LavadoCompleto = 1;
                    break;
                default:
                    System.out.println("El tipo de ropa no esta disponible");
                    System.out.println("Se lavara como ropa de color / Lavado intenso");
                    LavadoCompleto = 1;
                    break;
            }
        }
    }
    private void Secado(){
        Lavado();
        if(LavadoCompleto == 1){
            System.out.println("Secando...");
            SecadoCompleto = 1;
        }
    }
    public void CicloFinalizado(){
        Secado();
        if(SecadoCompleto == 1){
            System.out.println("Tu ropa esta lista!.");
        }
    }
    //seter & getter
    public int getTipoDeRopa(){
        return TipoDeRopa;
    }

    /**
     *
     * @param TipoDeRopa
     */
    public void setTipoDeRopa(int TipoDeRopa){
        this.TipoDeRopa = TipoDeRopa;
    }
}
