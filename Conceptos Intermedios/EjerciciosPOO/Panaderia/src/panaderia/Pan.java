package panaderia;

public class Pan {
	
	private String nombrePan;
	private double precio;
	private Integer totalingredientes;
    private Integer cantidadElaborada;
    private DIA dia;
    private Integer cantidadVendida;
    
    
    
	public String getNombrePan() {
		return nombrePan;
	}
	public void setNombrePan(String nombrePan) {
		this.nombrePan = nombrePan;
	}
	public Integer getCantidadElaborada() {
		return cantidadElaborada;
	}
	public void setCantidadElaborada(Integer cantidadElaborada) {
		this.cantidadElaborada = cantidadElaborada;
	}
	public Integer getTotalingredientes() {
		return totalingredientes;
	}
	public void setTotalingredientes(Integer totalingredientes) {
		this.totalingredientes = totalingredientes;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Integer getCantidadVendida() {
		return cantidadVendida;
	}
	public void setCantidadVendida(Integer cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}
	public DIA getDia() {
		return dia;
	}
	public void setDia(DIA dia) {
		this.dia = dia;
	}
}
