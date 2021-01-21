package mx.unam.fes.acatlan.mac.poo.frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDatos {
	private JLabel lbMaterno;
	private JTextField txtMaterno;
	private JLabel lbFechaNac;
	private JTextField txtFechaNac;
	private JLabel lbGenero;
	private JTextField txtGenero;
	
	public PanelDatos() {
		setLayout(new BorderLayout());
		TitledBorder border=BorderFactory.createTitledBorder("Datos del Alumno");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		
		JPanel PanelDatosAlumno = new JPanel();
		JPanel PanelFotoAlumno = new JPanel();
		
		add(PanelDatosAlumno,BorderLayout.CENTER);
		add(PanelFotoAlumno,BorderLayout.EAST);
		
		lbNombre = new JLabel("Name:  ");
		lbPaterno = new JLabel("Apellido Paterno: ");
		lbMaterno = new JLabel("Apellido Materno: ");
		lbGenero = new JLabel("Sexo:  ");
		lbFechaNac = new JLabel("Feha de Nacimiento");
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setBackground(Color.LIGHT_GRAY);
		txtNombre.setForeground(Color.BLUE);
		
		txtPaterno = new JTextField();
		txtPaterno.setEditable(false);
		txtPaterno.setBackground(Color.LIGHT_GRAY);
		txtPaterno.setForeground(Color.BLUE);
		
		txtMaterno = new JTextField();
		txtMaterno.setEditable(false);
		txtMaterno.setBackground(Color.LIGHT_GRAY);
		txtMaterno.setForeground(Color.BLUE);
		
		
		txtFechaNac = new JTextField();
		txtFechaNac.setEditable(false);
		txtFechaNac.setBackground(Color.LIGHT_GRAY);
		txtFechaNac.setForeground(Color.BLUE);
		
		
		PanelDatosAlumno.setLayout(new GridLayout(7,2));
		
		PanelDatosAlumno.add(lbNombre);
		PanelDatosAlumno.add(txtNombre);
		PanelDatosAlumno.add(lbMaterno);
		PanelDatosAlumno.add(txtMaterno);
		PanelDatosAlumno.add(lbPaterno);
		PanelDatosAlumno.add(txtPaterno);
		PanelDatosAlumno.add(lbGenero));
		PanelDatosAlumno.add(comp);
		PanelDatosAlumno.add(lbFechaNac);
		PanelDatosAlumno.add(txtFechaNac);
		
		lbImagen = new JLabel("FOTO ALUMNO");
		panelFotoAlumno.add(lbImagen);
	}

}
