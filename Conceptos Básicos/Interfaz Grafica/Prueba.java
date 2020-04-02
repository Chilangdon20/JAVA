import javax.swing.*;
import javax.swing.event.*;

public class Prueba extends JFrame implements ChangeListener{

  private JCheckBox check1, check2, check3;

  public Prueba(){
    setLayout(null);
    check1 = new JCheckBox("Ingresos");
    check1.setBounds(10,10,150,30);
    check1.addChangeListener(this);
    add(check1);

    check2 = new JCheckBox("Canjear");
    check2.setBounds(10,50,150,30);
    check2.addChangeListener(this);
    add(check2);

    check3 = new JCheckBox("Productos");
    check3.setBounds(10,90,150,30);
    check3.addChangeListener(this);
    add(check3);
  }


  public void stateChanged(ChangeEvent e){
    String cad="";

    if(check1.isSelected() == true){
	cad = cad + "Inglés-";
    }
    if(check2.isSelected() == true){
	cad = cad + "Francés-";
    }
    if(check3.isSelected() == true){
	cad = cad + "Alemán-";
    }
    setTitle(cad);
  }

  public static void main(String args[]){
   Prueba formulario1 = new Prueba();
   formulario1.setBounds(0,0,350,200);
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null);
  }
}