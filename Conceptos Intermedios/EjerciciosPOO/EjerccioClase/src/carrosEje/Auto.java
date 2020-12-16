package carrosEje;

import java.sql.Date;

public class Auto {
	
	private String placas;
	private String modelo;
	private String marca;
	private Integer year;
	private String Color;
	private Date fechaEntrada;
	private Date fechaSalida;
	private String descripcionReparacion;
	private String duenio;
	private double costoReparacion;
	public String getPlacas() {
		return placas;
	}
	public void setPlacas(String placas) {
		this.placas = placas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(java.util.Date date) {
		this.fechaEntrada=(Date) date;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(java.util.Date date) {
		this.fechaSalida = (Date) date;
	}
	public String getDescripcionReparacion() {
		return descripcionReparacion;
	}
	public void setDescripcionReparacion(String descripcionReparacion) {
		this.descripcionReparacion = descripcionReparacion;
	}
	public String getDuenio() {
		return duenio;
	}
	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}
	public double getCostoReparacion() {
		return costoReparacion;
	}
	public void setCostoReparacion(double costoReparacion) {
		this.costoReparacion = costoReparacion;
	}
}