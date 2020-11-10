package clasePOO;

public class PruebaAlumno {
	
	public static void main(String[] args) {
		
		
		Alumno alumno1 = new Alumno();
		Carrera c = new Carrera();
		alumno1.setNombre("Fernando");
		alumno1.setApellidoM("Vazquez Sanchez");
		
		// lamamos a los valores de un ENUM
		/* Un enum nos sirve
		 *  apra solamente poder usar los elementos que tenemos
		 * disponibles*/
		
		
		alumno1.setTurno(Turno.VESPERTINO);
		// llenamos nuestra informacion acerca de la carrera
		c.setSemestre(8);
		c.setCarrera("MAC");
		// tomamos los datos de la carrera
		alumno1.setCarrera1(c);
		System.out.println(alumno1.getNombre()+ " " + alumno1.getApellidoM());
		System.out.println(alumno1.getCarrera1().getSemestre());
		
		
		/******************************/
		
		
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Fer");
		alumno2.setApellidoP("Vazquez");
		alumno2.setApellidoM("Sanchez");
		alumno2.setTurno(Turno.VESPERTINO);
		alumno2.setCarrera1(new Carrera());
		alumno2.getCarrera1().setCarrera("Mac");
		alumno2.getCarrera1().setSemestre(8);
		System.out.println(alumno2.getCarrera1().getSemestre());
	}

}
