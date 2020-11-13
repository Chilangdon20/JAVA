package clasePOO;

import javax.swing.JOptionPane;

public class Carrera {
	
	private String carrera;
	private Integer semestre;
	private Integer clave;
	
	public void mostrarInfo(){
		JOptionPane.showMessageDialog(null,"Carrera: "+getCarrera()
        +"\nSemestre: "+getSemestre()
		+"\nClave: "+getClave());
	}
		public String getCarrera() {
			return carrera;
	}
		
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Integer getSemestre() {
		return semestre;
	}
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
	public Integer getClave() {
		return clave;
	}
	public void setClave(Integer clave) {
		this.clave = clave;
	}

}
