
package area;

public class Rectangulo {
    //declaramos espacios en memoria
    private int b,a,r;
    //Creacion de constructor
    public Rectangulo(int base,int altura){
        //guardamos los valores env ariables nuevas
        this.b =  base;
        this.a = altura;
        
    }
    //Creamos el metodo que va a realizar la operacion
    public void Formula(){
        r = b*a;
    }
    //Creamos el emtodo que imprimira el resultado
    public void Imprimir(){
        Formula();
        System.out.print("El resultado es : " + r);
    }
    
}

