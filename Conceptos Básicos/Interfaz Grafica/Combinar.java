//OBJETIVO : Combinar componentes de JButon a JTextArea
import javax.swing.*;
import java.awt.event.*;

public class Combinar extends JFrame implements ActionListener{
    //Declaramos los componentes que vamos a utilizar
    private JTextField textfield1;
    private JScrollPane scrollpane1;
    private JScrollArea textarea1;
    private JButton boton1;
    //Declaramos una variable donde se v a guardar la inforamcion que declare el usuario
    String text = "";
    //Constructor
    public Combinar(){
        setLayout(null);
        //Diseño de componentes
        textfield1 = new JTextField();
        textfield1.setBounds(10, 10, 200, 30);
        add(textfield1);

        //diseño a boton
        boton1 = new JButton("add");
        boton1.setBounds(250,10,100,30);
        add(boton1);
        boton1.addActionListener(this);  
         //Creamos objeto para textarea1
         textarea1 = new JTextArea();
         scrollpane1 = new JScrollPane(textarea1);
         scrollpane1.setBounds(10, 50, 400, 300);
         add(scrollpane1);
      }
      //programacion de eventos
      public void actionPerformed(ActionEvent e){
          if(e.getSource() == boton1){
            //Creamos un acomulador 
            text +=  textfield1.getText() + "\n "; ///Con esta parte de codigo indicamos que de un salto de linea cada vez que acomule texto y lo guarde en la variable text
            textarea1.setText(text);//Coloca el texto dentro del componente
            //Limpiamos el jtextfile
            textfield1.setText("");
          }
      }

public  static void main(String args[]) {
    Combinar formulario1 = new Combinar();
    formulario1.setBounds(0,0,540,400);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);

   }
 }