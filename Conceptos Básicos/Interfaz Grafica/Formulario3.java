import javax.swing.*; // Importamos la libreria

 public class Formulario3 extends JFrame{
    private JLabel label3;
    private JLabel label4;

    public Formulario3(){
        //EMPEZAMOS A DISEÑAR ETIQUETAS//
        setLayout(null);//Con la palabra null no hara nad a menos que nostros indiquemos la instruccion
        label3 = new JLabel("C.H.I.L.A.N.G.D.O.N.");
        label3.setBounds(10, 20, 300, 60);
        add(label3); //Con este metodo nos mostrara en pantalla 
        label4 = new JLabel("Diseñado por Fernando");
        label4.setBounds(10,100,100,30);
        add(label4);
    }
    //Arranque de programa
    public static void main(String args[]){
        Formulario3 formulario3 = new Formulario();
        formulario3.setBounds(0,0,300,200);
        //Eliminamos la opcion de que el usuario pueda modificar le tamño de la interfaz grafica
        formulario3.setResizable(false);
        //Visualizamos la intergaz grafica en pantalla
        formulario3.setVisible(true);
        //Indicamos al programa que cuando arranque la interfaz se muestre al cetro de la pantalla
        formulario3.setLocationRelativeTo(null);
    }
} 