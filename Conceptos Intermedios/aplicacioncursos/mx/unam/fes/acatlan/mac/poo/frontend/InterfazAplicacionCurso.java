/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncursos.mx.unam.fes.acatlan.mac.poo.frontend;

/**
 *
 * @author fernandov
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JFrame;

public class InterfazAplicacionCurso extends JFrame {
    
    // variables de cda panel
    private PanelDatos panelDatos;
    private PanelRegistro panelRegistro;
    private PanelNavegacion panelNavegacion;
    
    
    // Constructor
        public InterfazAplicacionCurso()
        {
            
            setTitle("Aplicacion Cursos");
            setSize(700,450);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);
            setLayout(new BorderLayout() );
            
            // creacion de panel
            panelDatos = new PanelDatos();
            panelRegistro = new PanelRegistro();
            panelNavegacion = new PanelNavegacion();
            
            // organizacion panel principal
            add(panelDatos,BorderLayout.NORTH);
            add(panelRegistro,BorderLayout.CENTER);
            add(panelNavegacion,BorderLayout.SOUTH);
            
            
            
        }
        
    

 public static void main(String[] args){
     
     
     // def objetos
     InterfazAplicacionCurso interfaz = new InterfazAplicacionCurso();
     interfaz.setVisible(true);
 
 
 }
}
   
