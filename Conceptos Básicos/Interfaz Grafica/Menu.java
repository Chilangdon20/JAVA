//PROGRAMACION DE MENU CON EVENTOS
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{
//Declaracion de componentes
private JMenuBar menubar;
private JMenu  menu1;
private JMenuItem menuitem1,menuitem2,menuitem3;

public Menu(){
    setLayout(null);
    //diseño de barra deplegable
    menubar = new JMenuBar();
    setJMenuBar(menubar);
     
    menu1 = new JMenu("Colores");
    //añadimos a la barra menu1
    menubar.add(menu1);

    menuitem1 = new JMenuItem("Verde");
    menuitem1.addActionListener(this); //con esta parte indicamos que el menuitem v a tener una fucnion que programarems  mas adelante
    menu1.add(menuitem1);

    menuitem2 = new JMenuItem("Rojo");
    menuitem2.addActionListener(this); //con esta parte indicamos que el menuitem v a tener una fucnion que programarems  mas adelante
    menu1.add(menuitem2);

    menuitem3 = new JMenuItem("Azul");
    menuitem3.addActionListener(this); //con esta parte indicamos que el menuitem v a tener una fucnion que programarems  mas adelante
    menu1.add(menuitem3);

    
}
//PROGRAMACION DE EVENTOS
public void actionPerformed(ActionEvent e){
    Container fondo = this.getContentPane();
//colocamos 3 condicionales ya que tenemos 3 opciones, con esto vamos a verificar en donde se ubica y la accion a ejecutar.

    if(e.getSource() == menuitem1){
     //Con esta parte va a modificar el color de fondo de nuestro contenedor
        fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == menuitem2){
        fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == menuitem3){
        fondo.setBackground(new Color(0,0,255));
    }
}

//diseño de interfaz grafica
public static void main(String[] args) {
    Menu formulario1 = new Menu();
    formulario1.setBounds(0,0,600,200);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
 }
}