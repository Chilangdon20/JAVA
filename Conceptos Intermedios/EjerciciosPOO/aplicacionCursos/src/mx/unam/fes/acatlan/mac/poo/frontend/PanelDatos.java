package mx.unam.fes.acatlan.mac.poo.frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;

public class PanelDatos {
	
	public PanelDatos() {
		setLayout(new BorderLayout());
		TitledBorder border=BorderFactory.createTitledBorder("Datos del Alumno");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
	}

}
