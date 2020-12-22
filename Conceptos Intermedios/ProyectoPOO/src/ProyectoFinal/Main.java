
/**
 *
 * @author EQUIPO FVE
 * 
 * CLASE MAIN
 * 
 * CLASE ENCARGADA DE ARRANCAR LA VENTAN DE NUESTRO JUEGO
 */
package proyectoffinal;

import proyectoffinal.InicioFrame;


// IMPORTAMOS TODO EL PAQUETE PARA PODER USAR LAS CLASES


public class Main {
    // llamamos al frame , i.e el inicio del juego
    public static void main(String[] args){
        /* Comienza nuestro jego */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioFrame().setVisible(true);
            }
        });
    }
}
