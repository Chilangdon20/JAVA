package ejemplo;
//Fernando V.S
import javax.swing.JOptionPane;
public class PlanEstudios {
	
	// atributos
		private int año;
		private String clave;
		private String materias;
	    private String temas;
		private boolean estado;
	    

		
		// funciones a realizar 
		
		public void VerInfo() {
			JOptionPane.showMessageDialog(null,"Año: "+getAño()+
					"\n Clave: "+getClave()+
					"\n Materias: "+getMaterias()+
					"\n estado: "+getEstado()
					);
		}
		
		public void ConsultaTema(){
			
			String consulta="El tema que vas a consulatr es: : ";
			
			consulta+=JOptionPane.showInputDialog("Ingresa el tema a consultar: ");		

			JOptionPane.showMessageDialog(null, consulta);
			
		}

        
		
		// metodos get y set
		public int getAño() {
			return año;
		}


		public void setAño(int año) {
			this.año = año;
		}


		public String getClave() {
			return clave;
		}


		public void setClave(String clave) {
			this.clave = clave;
		}


		public String getMaterias() {
			return materias;
		}


		public void setMaterias(String materias) {
			this.materias = materias;
		}


		public boolean getEstado() {
			return estado;
		}


		public void setEstado(boolean estado) {
			this.estado = estado;
		}
		
		
		
		

}
