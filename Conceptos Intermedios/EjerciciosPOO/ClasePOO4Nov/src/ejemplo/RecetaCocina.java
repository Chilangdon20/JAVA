package ejemplo;

public class RecetaCocina {
	
    private String platillo;
    private Pasos[] pasos;
    
    
    public void llamar(){
        System.out.println("Llamado de paltillo "+platillo+" pasos: "+pasos);
    }
    
	public String getPlatillo() {
		return platillo;
	}
	public void setPlatillo(String platillo) {
		this.platillo = platillo;
	}
	public Pasos[] getPasos() {
		return pasos;
	}
	public void setPasos(Pasos[] pasos) {
		this.pasos = pasos;
	}

}
