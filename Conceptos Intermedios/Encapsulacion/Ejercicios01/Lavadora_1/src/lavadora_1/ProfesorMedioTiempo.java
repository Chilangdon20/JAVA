package lavadora_1;

public final class ProfesorMedioTiempo extends Profesor{

	public float calcularSalario(int noHora) {
		return noHora *100 + 1000;
	}
}
