package lavadora_1;

public abstract class Profesor {

	protected String cedula;
	
	public float calcularSalario(int noHora) {
		return noHora *100;
	}
	
	public final void calcularEstimulo(int noHoras) {
		
		
	}
	
}
