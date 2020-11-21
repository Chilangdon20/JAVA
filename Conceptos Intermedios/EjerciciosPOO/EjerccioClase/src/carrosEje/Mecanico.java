package carrosEje;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
    
    public ArrayList<Auto> mostrarAutosNoReparados(){
    	
    	ArrayList<Auto> autosNoReparados=new ArrayList<Auto>();
    	
    	Date hoy = new Date();
    	
    	
    	for(Auto autoTemp : autos) {
    		if(autoTemp.getFechaSalida()==null || autoTemp.getFechaSalida().after(hoy)) {
    			autosNoReparados.add(autoTemp);
    		}
    	}
    	
    	return autosNoReparados;
    }
    
    public double obtenerComision(Auto automovil) {
    	double comission=0;
    	if(automovil.getCostoReparacion()<=1000) {
    		comission=automovil.getCostoReparacion()*0.3;
    		
    	}else if(automovil.getCostoReparacion()<=2000) {
    		comission=automovil.getCostoReparacion()*.1;
    		
    	}else {
    		comission=automovil.getCostoReparacion()*.15;
    	}
    	return comission;
    }
    
    
    public Integer totalDeAutosReparadosXMes(Integer mes,Integer anio) {
    	
    	Integer total=0;
    	Calendar fechaSalida=Calendar.getInstance();
    	for(Auto autoTemp : autos) {
    		if(autoTemp.getFechaSalida()!=null) {
    			fechaSalida.setTime(autoTemp.getFechaSalida());
    			if(fechaSalida.get(Calendar.MONTH)== (mes-1) && fechaSalida.get(Calendar.YEAR)== anio) {
    				total++;
    			}
    		}
    	}
    	return total;
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
