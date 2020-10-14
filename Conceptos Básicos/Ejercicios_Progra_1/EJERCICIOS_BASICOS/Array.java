import java.util.Scanner;

public class Array{
    public static void main(String[] args) {

         // declaracion de variables

        Scanner pedirDato = new Scanner(System.in);
        System.out.println("Ingresa un numero positivo e impar: ");
		    int n = pedirDato.nextInt();
		
        /**
        
        
        Cuando declaramos una matriz , solo creamos una referencia de una matriz,
        para crear realente o dar memoria a una amtriz necesitamos aplicar new a los arays
        multidimensionales.

        En este caso declaramos una matriz de tamaño n .

        **/

        int matriz[][]=new int[n][n]; 
        

        // Declaramos cont =1 para que empiece en la fila de arriba
        int cont=1;
        int hUlti, pUlti;

        // con hSig forzamos para empezar al centro de las columnas
        int hSig=n/2;
        int f_sig=0;


        // Inicia la implementacion de las condiciones del codigo
        for (int fila = 0; fila<n; fila++){ // este for recorre la fila de nuestra matriz.
            for (int columna = 0; columna<n; columna++){ // este for recorre la columna de nuestra columa
                
                // Al iniciar el cont = 1 estara en la fila de arriba y en el centro 
                
                matriz[f_sig][hSig]=cont;
 
                // pUlti guarda la ultima posicion de la fila
                
                pUlti=f_sig;
                // hulti guarda la ultima posicion de la columna.
                hUlti=hSig;
 
                //primer paso para la siguiente posicion y reasignaión de variables
                // Paso 2
                f_sig=pUlti-1;
                hSig=hUlti+1;

                //// Gracias a los if estamos controlando que los elementos caigan dentro de la matriz
                if(f_sig<0){
                    f_sig=n-1;
                }

                if(hSig>=n){
                    f_sig=pUlti-1;
                    hSig=0;
                }
 
                if(f_sig==-1 || matriz[f_sig][hSig]!=0){
                    f_sig=pUlti+1;
                    hSig=hUlti;
                }
                //Incremento de variable que servira para guardar dentro del arreglo bidimensional.
                cont++;
            }
        }                 

        
        //Salida de Datos
        System.out.println("La matriz es: ");
        for(int p=0;p<n;p++){
            for(int h=0;h<n;h++){
                System.out.print(matriz[p][h]+"| ");
            }//fin de los "H"
            System.out.print("\n");
        }//fin de los P           
 
        
    }//fin del main
    
}