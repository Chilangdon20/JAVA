/* 
 * Fernando Vazquez Sanchez.
 * 
 * 
 * No Cuenta : 420082523.
 * 
 * 
 * 
 * */



// paquete donde se guardan mis clases
package pregunta;


// importamos libreria para el arraylist

import java.util.ArrayList;



// Clase Agenda
public class Agenda {
	
	// Declaracion de atributos 
	
	
	private String propietario;
	private String telefonoPropietario;
	
	
	
	// constructor
	
	
	public Agenda(String propietario,String telefonoPropietario) {
		
		
		// asignacion de valores
		this.propietario=propietario;
		this.telefonoPropietario=telefonoPropietario;
		
	}
	
	//----------------------------------//
	
	
	// metdo calcular contactos
	
	private int calcularTotalContactos(int totalContactos) {
		return totalContactos;
	}
	
	
	// metodo muestraContactoXNombre(String
	
	private ArrayList muestraContactoXNombre() {
		
		ArrayList nombreContacto11 = new ArrayList();
		
		// retornamos el nombre del contacto
		return nombreContacto11;
		
		
		
	}
	
	
	// metodo agregarContacto
	
	private ArrayList agregarContacto(Contacto contacto) {
		
		// agrgamos el contaco a nuestro metodo
		ContactoXNombre.add(contacto);
		
	}
	
	
	//----------------------------------//
	
	
	// metodos get y set
	
	
	
	// Devuelve el propietario
	public String getPropietario() {
		return propietario;
	}
	
	// modifica el propietario
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	
	// devuelve el telefonopropietario
	public String getTelefonoPropietario() {
		return telefonoPropietario;
	}
	
	
	
	// modifica el telefono propietario
	public void setTelefonoPropietario(String telefonoPropietario) {
		this.telefonoPropietario = telefonoPropietario;
	}
	
	

}
