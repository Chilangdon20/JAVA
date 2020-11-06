package ejemplo;

import javax.swing.JOptionPane;

// Fernando V.S

public class FormQuimica {
	
	// atributos
	private String nombre;
	private int cantidad;
	private boolean estado;
	
	// metodos 
	
	public void VerInfo() {
		JOptionPane.showMessageDialog(null,"Nombre: "+getNombre()+
				"\n Cantidad: "+getCantidad()+
				"\n Estado: "+getEstado()
				);
	}
	
	// metodos get y set
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	

}


