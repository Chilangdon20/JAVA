package carrosEje;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Taller {
	
	private String razonSocial;
	private String direccion;
	
	private Mecanico mecanico1;

	private Mecanico mecanico2;

	private Mecanico mecanico3;
	
	private List<Auto> autos;
	
	
	public Taller(String razonSocial,String direccion) {
		
		this.razonSocial=razonSocial;
		this.direccion=direccion;
		this.mecanico1=new Mecanico();

		this.mecanico2=new Mecanico();

		this.mecanico3=new Mecanico();
		
	}
	

	
	/* metodos que calcuaelsalarioTotal
	Generar el método “calculaSalarioTotal(Mecanico,int,int) que proporcione el salario + la comisión obtenida por cada mecánico por mes y año. (el primer parámetro es el mecánico, el segundo parámetro es el mes los valores del permitidos son del 1 al 12 y el último parámetro corresponde al año). El valor de retorno debe de ser una cadena con el siguiente formato:
		Mecanico nombreDelMecanico: salario+comisión=total Reglas de operación
		• La reparación de un auto se contabiliza como auto reparado en el mes de su fecha de salida.
		• La comisión se calcula con base al costo de reparación de la siguiente forma: ➢ Hasta 1000 la comisión es el de 3% sobre el costo total de reparación ➢De 1001 a 2000 autos el porcentaje es de 10% sobre el costo total de
		reparaciones al mes
		➢ Más de 2000 el porcentaje es de 15% sobre el costo total de reparaciones
		al mes*/
	
	public String calculaSalarioTotal (Mecanico mecanico, int mes, int anio)
	{
		double comTot=0;
		Calendar fechaSal = Calendar.getInstance();
		
		
		for(Auto autoTemp : mecanico.getAutos())
		{
			fechaSal.setTime(autoTemp.getFechaSalida());
			if(fechaSal.get(Calendar.MONTH) == (mes-1) && fechaSal.get(Calendar.YEAR)== anio)
				comTot+= mecanico.obtenerComision(autoTemp);
		}
		
		String ans = "Mecanico " + mecanico.getNombre() + "  "+ mecanico.getSalario() + "+" 
						+ comTot + "=" +(mecanico.getSalario()+comTot);
		
		return ans;
	}
	
	public ArrayList<Auto> consultaAutosEnReparacion(Mecanico mecanico) {
		ArrayList<Auto> noRep = mecanico.mostrarAutosNoReparados();
		return noRep;
	}
	
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Mecanico getMecanico1() {
		return mecanico1;
	}
	public void setMecanico1(Mecanico mecanico1) {
		this.mecanico1 = mecanico1;
	}
	public Mecanico getMecanico2() {
		return mecanico2;
	}
	public void setMecanico2(Mecanico mecanico2) {
		this.mecanico2 = mecanico2;
	}
	public Mecanico getMecanico3() {
		return mecanico3;
	}
	public void setMecanico3(Mecanico mecanico3) {
		this.mecanico3 = mecanico3;
	}



	public List<Auto> getAutos() {
		return autos;
	}



	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}

}
