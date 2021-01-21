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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelRegistro extends JPanel{
    
    private JLabel lbCurso;
    private JComboBox<String> cbCurso;
    
    private JLabel lbTutor;
    private JComboBox<String> cbTutor;
    
    
    private JButton btnRegistrarCurso;
    private JButton btnEliminarCurso;
    private JButton btnRegistrarCuso;
    private JButton btnEliminarTutor;
    
    // constructor
    
    public PanelRegistro(){
        setLayout(new BorderLayout());
        TitledBorder border =BorderFactory.createTitledBorder("Registro");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        lbCurso = new JLabel("Curso:  ");
        lbTutor = new JLabel("Tutor:  ");
        
        cbCurso = new JComboBox();
        cbCurso.addItem("CURSO 1");
        cbCurso.addItem("CURSO 2");
        cbCurso.addItem("CURSO 3");
        cbCurso.addItem("CURSO 4");
        
        cbTutor = new JComboBox();
        cbTutor.addItem("TUTOR 1");
        cbTutor.addItem("TUTOR 1");
        cbTutor.addItem("TUTOR 1");
        
        btnRegistrarCurso = new JButton("Registrar Curso");
        btnEliminarCurso = new JButton("Eliminar Curso");
        JButton btnRegistrarTutor = new JButton("Registrar Tutor");
        btnEliminarTutor = new JButton("Eliminar Tutor");
        
        lbCurso.setBounds(5,50,50,20);
        cbCurso.setBounds(60,50,200,20);
        lbTutor.setBounds(5,100,500,20);
        cbTutor.setBounds(60,100,200,20);
        
        
        btnRegistrarCurso.setBounds(10,150,140,20);
        btnEliminarCurso.setBounds(160,150,140,20);
        btnEliminarTutor.setBounds(460,150,140,20);
        
        add(lbCurso);
        add(cbCurso);
        add(lbTutor);
        add(cbTutor);
        add(btnRegistrarCurso);
        add(btnEliminarCurso);
        add(btnRegistrarTutor);
        add(btnEliminarTutor);
        
        
    }
    
}
