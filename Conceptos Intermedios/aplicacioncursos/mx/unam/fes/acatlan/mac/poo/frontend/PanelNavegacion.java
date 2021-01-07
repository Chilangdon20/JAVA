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
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
public class PanelNavegacion extends JPanel {
    
    private JButton btnSiguiente;
    private JButton btnAnterior;
    
    // constructor
    
    public PanelNavegacion() {
        setLayout(new BorderLayout());
        TitledBorder border =BorderFactory.createTitledBorder("Registro");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        
        btnSiguiente = new JButton(">");
        btnAnterior = new JButton("<");
        
        add(btnAnterior);
        add(btnSiguiente);
        
        
    }
    
}
