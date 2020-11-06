package ejemplo;

public class Celular {
	 private String marca,modelo;
	 private int imei;
	    
	    
	 public void llamar(){
	        System.out.println("Llamando de "+marca+" Modelo: "+modelo);
	    }

     public void detalleCelular(Celular celular){
	        System.out.println("Nombre: " + celular.marca + "\nModelo:  " + celular.modelo );
	        
	    }


     public int getImei() {
			return imei;
		}


     public void setImei(int imei) {
			this.imei = imei;
		}
     
     public void getMarca() {
    	 this.marca = marca;
     }
     
     public void setMarca() {
    	 return marca;
     }
     
     public void getModelo()
     {
    	 this.modelo = modelo;
     }
     public void setModelo(){
 return modelo;   	 
 }
}
