//Manejo de botones & etiquetas
import javax.swing.*;//componentes

import javafx.event.ActionEvent;

import java.awt.event.*;//eventos
public class Formu JFrame implements ActionListener{
    //Creamos los  componentes que vamos a usar
    private JButton boton1, boton2, boton3; //declaramos los componentes que vamos a utilizar de tipo JButton
    //Indicamos que con esta opcion cada vez que se presione un boton el texto va a cambiar
    private JLabel label1;
    //Diseño de componentes con un constructor publico
    public Formu(){
        setLayout(null);
        boton1 = new JButton("Take a pic");
        boton1.setBounds(10, 100, 90, 30);
        //indicamos que todo el diseño anterio lo agregue al boton1
        add(boton1);
        //indicamos que boton1 va a estar  ala espera de la instruccion
        boton1.addActionListener(this);
        //Inicia boton2
        boton2 = new JButton("Send Message");
        boton2.setBounds(10, 100, 90, 30);
        add(boton2);
        boton2.addActionListener(this);
        //inicia boton3
        boton3 = new JButton("Open file");
        boton3.setBounds(10, 100, 90, 30);
        add(boton3);
        boton3.addActionListener(this);
        //damos diseño al jlabe1
        label1 = new JLabel("En espera...");
        label1.setBounds(10, 10, 300, 30);
        add(label1);
        //TERMINA LA PARTE DE LOS DISEÑOS
    }
//Creamos la parte donde vamos a capturar los eventos de cada boton
   public void actionPerformed(ActionEvent e){
     if(e.getSource() == boton1){
       label1.setText("Proximamente");
     }
     if(e.getSource()==boton2){
         label1.setText("No disponible por ahora");
   }
   if(e.getSource() == boton3){
       label1.setText("Archivo no disponible");
   }
   //creamos el diseño de nuestra interfaz grafica
public static void main(String args[]){
     Formu manejo1 = new Formu();
     manejo1.setBounds(0, 0, 350, 200);
     manejo1.setVisible(true);
     manejo1.setResizable(false);
     manejo1.setLocationRelativeTo(null);
}
