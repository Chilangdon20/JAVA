/* 
 * Fernando Vazquez Sanchez.
 * 
 * 
 * No Cuenta : 420082523.
 * 
 * 
 * 
 * */


// paqete donde se guardan mis clases
package pregunta;

// clase Contacto

public class Contacto {

	// Declaracion de Metodos
	
	private String nombre;
	private String email;
	private String celular;
	private String telefono;
	
	
	// Constructor
	
	public Contacto(String nombre,String email,String celular,String telefono) {
		
		
		// asignacion de valores
		
		this.nombre=nombre;
		this.email=email;
		this.celular=celular;
		this.telefono=telefono;
	}
	
	// Declaracion de metdos get y set para los atributos
	
	// Devuelve el nombre
	public String getNombre() {
		return nombre;
	}
	
	// Modifica el nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Devuelve el email
	public String getEmail() {
		return email;
	}
	
	// Modifica el email
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Devuelve el celular
	public String getCelular() {
		return celular;
	}
	
	// Modifica el celular
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	// devuelve el telefono
	public String getTelefono() {
		return telefono;
	}
	
	// modifica el telefono
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
