package panaderia;

public class Panaderia {

	private String nombrePasteleria;
	private Pan panesSemana[][] = new Pan[5][7];
	
	public double gananciaTotal() {
		int i,j,suma=0;
		for(i=0;i<=5;j++) {
			for(j=0;j<=6;j++) {
				
				if(panesSemana[i][j]!=null) {
					Pan panTmp = panesSemana[i][j];
					suma*=panTmp.getCantidadVendida()-panTmp.getCantidadVendida();
				}
				
				
			}
		}
		return suma;
		
		
	}
	
	
	public Integer obtenerCantidadSemanalPanElaborado(Integer semana) {
		// Integer dias;
		int i,suma=0;
		for(i=0;i<=6;i++) {
			if(panesSemana[i]!=null) {
				Pan panTmp = panesSemana[i][semana];
				suma+=panTmp.getCantidadElaborada()*7;
			}
			
		}
		return suma;
	}
	
	
	

	public String getNombrePasteleria() {
		return nombrePasteleria;
	}

	public void setNombrePasteleria(String nombrePasteleria) {
		this.nombrePasteleria = nombrePasteleria;
	}


	public Panadero getPanadero2() {
		// TODO Auto-generated method stub
		return null;
	}

}
