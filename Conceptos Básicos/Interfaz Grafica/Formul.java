import javax.swing.*;
import java.awt.event.*;

public class Formul extends JFrame implements ItemListener{
 
 private JComboBox combo1;

 public Formul(){
  setLayout(null);
  combo1 = new JComboBox();
  combo1.setBounds(10,10,80,20);
  add(combo1);

  combo1.addItem("Inicio");
  combo1.addItem("Contactos");
  combo1.addItem("Whatsapp");
  combo1.addItem("Facebook");
  combo1.addItem("Instagram");
  combo1.addItemListener(this);
 }

 public void itemStateChanged(ItemEvent e){
  if(e.getSource() == combo1){
    String seleccion = combo1.getSelectedItem().toString();
    setTitle(seleccion);
  }
 }

 public static void main(String args[]){
  Formul formulario1 = new Formul();
  formulario1.setBounds(0,0,200,150);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }
}