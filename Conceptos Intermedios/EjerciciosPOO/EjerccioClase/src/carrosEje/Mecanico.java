package carrosEje;

import java.util.ArrayList;
import java.util.List;

public class Mecanico {
	
	private String nombre;
	private String apodo;
	private Integer noEmpleado;
	private double salario;
	private List<Auto> autos;
	

	public Mecanico() {
		// inicializamos la lista
		this.autos=new ArrayList<Auto>();
	}
    public void agregarAuto(Auto automovil) {
		
		
		autos.add(automovil);
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public Integer getNoEmpleado() {
		return noEmpleado;
	}
	public void setNoEmpleado(Integer noEmpleado) {
		this.noEmpleado = noEmpleado;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public List<Auto> getAutos() {
		return autos;
	}
	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	} 

}
