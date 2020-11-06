package ejemplo;

public class Pasos {
	private String informacion;
    private Pasos pasos;

    public Pasos (String info) {
        this.informacion = info;
    }

    /**
     * @return the informacion
     */
    public String getInformacion() {
        return informacion;
    }

    /**
     * @param informacion the informacion to set
     */
    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    /**
     * @return the pasos
     */
    public Pasos getPasos() {
        return pasos;
    }

    /**
     * @param pasos the pasos to set
     */
    public void setPasos(Pasos pasos) {
        this.pasos = pasos;
    }

}
