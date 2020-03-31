 //AGREGREMOS BOTONES A LAS INTERFACES GRAFICAS
import javax.swing.*; //Nos permite crear el diseño de la interfaz grafica
import java.awt.event.*; //Agregar las funcionalidades de los componentes

public class Boton extends JFrame implements ActionListener {

    //Declaramos etiquetas
    JButton boton1;
    //Creamos el constructor para darle diseño a la intefaz
    public Boton(){
      setLayout(null);
      //Uso del objeto
      boton1 = new JButton("close");
      //damos cordenadas y dimensiones del boton
      boton1.setBounds(300, 250, 100, 30);
      //Agregamos los valores al objeto "boton1"
      add(boton1);
      //Agregamos el evento
      boton1.addActionListener(this);
    }
    //Programamos el evento qeu queremos que realize nuestro boton
    public void actionPerformed(ActionEvent F){
    //Programacion del evento
    if(F.getSource() == boton1){
       //Le indicamos que cierre la interfaz grafica al momento de presionar el boton
       System.exit(0);
    }
  }
  //Programamos el diseño de la interfaz grafica
  public static void main(String args[]){
      Boton boton2 = new Boton(); //Creamos le objeto
      boton2.setBounds(0,0,400,350); //Indicamos el tamaño de nuestra interfaz
      boton2.setVisible(true); //mostramos la interfaz grafica
      boton2.setResizable(true); //Indicamos al suusario si queremos que mueva el tamaño de la interfaz
      boton2.setLocation(null);//Iindicamos al programa que aparezca  centrada nuestra interfaz respecto a la pantalla 
    }
}
