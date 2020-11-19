package carrosEje;

public class Taller {
	
	private String razonSocial;
	private String direccion;
	
	private Mecanico mecanico1;

	private Mecanico mecanico2;

	private Mecanico mecanico3;
	
	
	public Taller(String razonSocial,String direccion) {
		
		this.razonSocial=razonSocial;
		this.direccion=direccion;
		this.mecanico1=new Mecanico();

		this.mecanico2=new Mecanico();

		this.mecanico3=new Mecanico();
		
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

}
