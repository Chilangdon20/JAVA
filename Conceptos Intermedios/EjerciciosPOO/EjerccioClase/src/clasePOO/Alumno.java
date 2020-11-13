package clasePOO;

import javax.swing.JOptionPane;

public class Alumno {
	
	// atributos
	
	private String nombre;
	private String apellidoP;
	private  String apellidoM;
	private Integer edad;
	private String ID;
	private Turno turno;
	private Carrera carrera1;
	private Carrera carrera2;
	
	// metodos

	public void mostrarDatosAlumno() {
		
		// leva como argumento null 
		JOptionPane.showMessageDialog(null,"Nombre: "+getNombre()
		+"\nApellido Paterno: "+getApellidoP()
		+"\nEdad: "+edad+"\nNo cuenta: "+getID()
	    +"\nTurno: "+getTurno());
		
		carrera1.mostrarInfo();
		
		
	}
	
	// Get y set
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoM() {
		return apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		
		// hacemo referencia la atributo de la clase
		this.edad = edad;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Carrera getCarrera1() {
		return carrera1;
	}
	public void setCarrera1(Carrera carrera1) {
		this.carrera1 = carrera1;
	}
	public Carrera getCarrera2() {
		return carrera2;
	}
	public void setCarrera2(Carrera carrera2) {
		this.carrera2 = carrera2;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	

}
