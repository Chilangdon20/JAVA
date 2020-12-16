package Clase23Nov;

public class Oficio {
	

	private String asunto;
	private String cuerpo;
	private static int folio;
	private int folioOficio;
	
	public Oficio() {
		
		
	}
	
	
	private static final String dependencia = "Acatlan";
	
	public Integer getFolio() {
		return folio;
	}

	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public static String getDependencia() {
		return dependencia;
	}

	public int getFolioOficio() {
		return folioOficio;
	}

	public void setFolioOficio(int folioOficio) {
		this.folioOficio = folioOficio;
	}
	

}
