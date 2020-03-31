import javax.swing.*;

public class Formular extends JFrame{
    //declaramos componenntes//
    private JTextField textfiel1;
    private JScrollPane jscrolpane1;
    private JTextArea textarea1;

    //Creamos constructor para el diseño de componentes
    public Formular(){
        setLayout(null);

        textfiel1 = new JTextField();
        textfiel1.setBounds(10, 10, 200, 30);
        add(textfiel1);

        textarea1 = new JTextArea();
        jscrolpane1 = new JScrollPane(textarea1);
        jscrolpane1.setBounds(10, 50, 400, 300);
        add(jscrolpane1);

    }
    public static void main(String args[]){
        Formular formulario1 = new Formular();
        formulario1.setBounds(0, 0, 540, 400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);

    }
}