package panaderia;



public class Panadero {
	
	// atributos
	
	private String apodo;
	private String nombre;
	private String rfc;
	private Pan panesSemana[][] = new Pan[5][7];
	
	// metodos
	
	
	/*El panadero debe de poder reportar la cantidad de
	 *  pan que elabora por semana
	 *  
	 *   */
	
	
	public Integer obtenerTotalPanElaborado() {
		
		int i,j,suma=0;
		for(i=0;i<=5;j++) {
			for(j=0;j<=6;j++) {
				
				if(panesSemana[i][j]!=null) {
					//obtenemos la cantidad elaborada de Pan
					//recorremos cada posicion , extraemos la cantidad pan y la sumamos
					suma=panesSemana[i][j].getCantidadElaborada();
				}
				
				
			}
		}
		return suma;
		
	}
	
	
	/* 
	 * El panadero debe de poder reportar las
       ventas totales de la semana (se calcula sumando la cantidad de 
       panes vendidos multiplicados por su precio por día y durante la 
       semana completa) 
	 * */
	
	
	public double getVentasTotales() {
		int i,j,suma=0;
		for(i=0;i<=5;j++) {
			for(j=0;j<=6;j++) {
				
				if(panesSemana[i][j]!=null) {
					Pan panTmp = panesSemana[i][j];
					suma+=panTmp.getCantidadVendida()*panTmp.getPrecio();
				}
				
				
			}
		}
		return suma;
		
		
	}
	
	/* 
	 * El panadero debe de poder 
	 * reportar la cantidad de pan que elabora por día
	 * */
	
	public Integer mostrarPanesElaboradosXDia(Integer dia) {
		// Integer dias;
		int i,suma=0;
		for(i=0;i<=6;i++) {
			if(panesSemana[i]!=null) {
				Pan panTmp = panesSemana[i][dia];
				suma+=panTmp.getCantidadElaborada();
			}
			
		}
		return suma;
	}
	
	
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Pan[][] getPanesSemana() {
		return panesSemana;
	}


	public void setPanesSemana(Pan panesSemana[][]) {
		this.panesSemana = panesSemana;
	}
	
		

}
