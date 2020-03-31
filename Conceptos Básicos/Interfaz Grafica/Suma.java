//Suma & resta

import javax.swing.*;

import javafx.event.ActionEvent;

import java.awt.event.*;

public class Suma extends JFrame implements ActionListener{

    //Declaramos nuestros componentes
    private JTextField textfield1, textfield2;
    //etiquetas
    private JLabel label1, label2,label3;
    //boton
    private JButton boton1;
    //Construccion de constructor
    public Suma(){
        //diseño de componentes
        setLayout(null);
        label1 = new JLabel("Valor 1 :");
        label1.setBounds(50, 5, 100, 30);
        add(label1);

        label2 = new JLabel("Valor 2 :");
        label2.setBounds(50, 35, 100, 30);
        add(label2);

        label3 = new JLabel("Resultado");
        label3.setBounds(120,80,100,30);
        add(label3);

         //DIseño del campo de texto
         textfield1 = new JTextField();
         textfield1.setBounds(120, 10,150,20);
         add(textfield1);

         textfield2 = new JTextField();
         textfield2.setBounds(120,10,150,20);
         add(textfield2);

         //diseño de botones
         boton1 = new JButton("sumar");
         boton1.setBounds(10,80,100,30);
         add(boton1);
         boton1.addActionListener(this);
        

    }

//Programacion del evento (PARTE LOGICA)
public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      //declaramos 3 variables
      int valor1=0,valor2=0,resultado=0;
      //Creacion de parceo
      valor1 = Integer.parseInt(textfield1.getText());
      valor2 = Integer.parseInt(textfield2.getText());
      resultado = valor1 + valor2 ;
      label3.setText("Resultado: " + resultado);
  }
 }

public static void main(String args[]) {
    Suma fomrulario1 = new Suma();
    formulario1.setBounds(0,0,30,150);
    fomrulario1.setVisible(true);
    formualrio1.setResizable(false);
    fomrulario1.setLocationRelativeTo(null);
 }
}