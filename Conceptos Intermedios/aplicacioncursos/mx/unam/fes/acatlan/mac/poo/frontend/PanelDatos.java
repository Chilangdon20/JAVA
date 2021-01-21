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
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelDatos extends JPanel{
    
    private JLabel lbImagen;
    // constructor
    
    public PanelDatos(){
        setLayout(new BorderLayout());
        TitledBorder border =BorderFactory.createTitledBorder("Datos Alumno");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        
        // paneles para info del alumno
        JPanel panelDatosAlumno = new JPanel();
        JPanel panelFotoAlumno = new JPanel();
        
        // agrgamos paneles secundarios a panel principal
        add(panelDatosAlumno,BorderLayout.CENTER);
        add(panelFotoAlumno,BorderLayout.EAST);
        
        // creacion de etiquetas
        JLabel lbNombre = new JLabel("Nombre:  ");
        JLabel lbPaterno = new JLabel("Apellido Paterno: ");
        JLabel lbMaterno = new JLabel("Apellico Materno: ");
        JLabel lbGenero = new JLabel("Sexo: ");
        JLabel lbFechaNac = new JLabel("Fecha de nacimiento: ");
        
        // configuracion de la zona de texto para el apellido paterno
        JTextField txtNombre = new JTextField();
        txtNombre.setEditable(false);
        txtNombre.setBackground(Color.LIGHT_GRAY);
        txtNombre.setForeground(Color.BLUE);
        
        // zona de texto para apellido paterno
        JTextField txtPaterno = new JTextField();
        txtPaterno.setEditable(false);
        txtPaterno.setBackground(Color.LIGHT_GRAY);
        txtPaterno.setForeground(Color.BLUE);
        // zona de texto para apellido Materno
        JTextField txtMaterno = new JTextField();
        txtMaterno.setEditable(false);
        txtMaterno.setBackground(Color.LIGHT_GRAY);
        txtMaterno.setForeground(Color.BLUE);
        // zona genero
        JTextField txtGenero = new JTextField();
        txtGenero.setEditable(false);
        txtGenero.setBackground(Color.LIGHT_GRAY);
        txtGenero.setForeground(Color.BLUE);
        // zona fecha nacimiento
        JTextField txtFechaNac = new JTextField(10);
        txtFechaNac.setEditable(false);
        txtFechaNac.setBackground(Color.LIGHT_GRAY);
        txtFechaNac.setForeground(Color.BLUE);
        //dist grafico
        panelDatosAlumno.setLayout(new GridLayout(7,2));
        // añadimos los elementos al frame principal
        panelDatosAlumno.add(lbNombre);
        panelDatosAlumno.add(txtNombre);
        panelDatosAlumno.add(lbPaterno);
        panelDatosAlumno.add(txtPaterno);
        panelDatosAlumno.add(lbMaterno);
        panelDatosAlumno.add(txtMaterno);
        panelDatosAlumno.add(lbGenero);
        panelDatosAlumno.add(txtGenero);
        panelDatosAlumno.add(lbFechaNac);
        panelDatosAlumno.add(txtFechaNac);
        
        lbImagen = new JLabel("Foto alumno");
        panelFotoAlumno.add(lbImagen);
        
        
        
        
        
    }

  
    
}
