/**
 *
 * @author EQUIPO FVE
 * CLASE juegopanel :
 * - ENCARGADA DE CREAR LAS NAVES ENEMIGAS
 * -  NAVE DE USUARIO
 * - BRINDAR ATRIBUTOS COMO LOS LIMITES DE PANTALLA
 * - MOVIMIENTO POR TECLADO
 * - tamaños de naves
 * - colores de naves
 * 
 */
package proyectoffinal;

//-----LIBRERIAS-------------//
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.Timer;

//-----CLASE PRINCIPAL-----------//

public class JuegoPanel extends JPanel implements KeyListener{
    
    //----VARIABLES GLOABLES----//
    
    // variable con la cual generamos nuestra nave
    public Rectangle2D nave;
    //variable t y e que nos va a marcar cada n tiempo cierta accion
    public Timer t,enemi;
    // variables que nos permitiran obtener el movimiento de nuestras naves
    public int xNave=240,enemigasI=20,enemigasAuX =0,enemigasAuY=0,movEn=10;
    /*
    variables para generar los movimientos aleatorios de las naves
    enemigas y las balas
    */
    public int aleaE1,aleaE2,contCaer=0,disparadas=0,contRec=0;
    /*creamos las variables con las cuales controlaremos 
    el movimiento de la nave
    */
    public boolean derNave=false,izquNave=true,derEnemigas=true,izqEnemigas=false;
    public boolean secFila=false,caer=false,acabad=false,fin=false;
    public Graphics2D g2;
    // declaramos un array de 2x5 para las flotas enemigas, total = 10 enemigos
    public Rectangle2D [][] nveEnemigas = new Rectangle2D[2][5];
    public Ellipse2D[] disparos = new Ellipse2D[15];//12
    //variables para obtener la posicion de las balas
    public int [] xDisp = new int[15];//12
    public int [] yDisp = new int[15];//12
    public int [][]YEnemi = new int[2][5];
    public int [][] vivas = new int[2][5];
    // variables principales del jugador
    public int lives=3,level=1,score=0,bullet=15,puntos=100,variable=5;
    public int tiempoNve=10,tiempoEnemigas=90;
        
   
    //---------CONSTRUCTOR-----------//
    
    // CONSTRUCTOR encargado de la pantall principal
    public JuegoPanel(String nombre) {
        // verificamos que este bien creado el constructor
        this.setBackground(Color.ORANGE);
        // permitimos que nuestro panel este enfocado
        this.setFocusable(true);
        // cambiamos el tamaño del frame
        this.setBounds(300,100,500,500);
        this.setPreferredSize(new Dimension(500,500));
        /* mandamos llamar keylistener para recuperar la info
        del teclado dada por el usuario
        */
        this.addKeyListener(this);
        
        
        
        
        /*
        En caso de que el usuario ingrese estos nombres tendra ciertas ventajas
        */
        if(nombre.equals("Matematicas")){
            
            lives=10;
            
        }
        if(nombre.equals("POO")){
            puntos=200;
        }
        if(nombre.equals("MAC")){
            variable=15;
        }
        // mandamos llamar funcion 
        iniDisp();
        iniAltu();
        timeNave();
        t.start();
        timeEnemigas();
        iniVivas();
        enemi.start();
        
        
    }
    
     //-------FUNCIONES------------------//
    
    public void iniVivas(){
        /*
        Funcion encargada de verificar si las naves enemigas
        aun estan con vida o no , recorriendo nuestro array.
        */
        for(int i =0;i<2;i++){
                for(int j = 0;j<5;j++){
                    vivas[i][j]=1;
                        
            }
        }
    }
        
    
    public void Atack(){
        /*
    
         NAME FUNCION: atack
       
          DESCRIPTION:
          Funcion que cada 3 timers empieza a desplegar 
          las naves enemigas
    
    
       */
        if(caer==false){
            /* S i nuestra nave ya paso del final de frame
            que busque otro numero
            */
           while(YEnemi[aleaE1][aleaE2]>=550){
           /* generamos los movimentos aleatorios
            de nuestras naves enemigas */
           aleaE1 = (int)(Math.random()*2);
           aleaE2 = (int)(Math.random()*5);
           }
        }
        /*pasamos nuestros valores aleatorios para que 
        puedan bajar nuestras naves enemigas*/
        
        YEnemi[aleaE1][aleaE2]+=7;
        /*
        Si una nace ya bajo competamente , entonces
        reiniciamos los valores
        */
        if(YEnemi[aleaE1][aleaE2]>=550){
            caer=false;
            contCaer=0;
        }
    }
    
    public void iniDisp(){
        /*
        for para tener todas nuestras balas a una
        altura inical de las naves enem9gias
        */
        for(int i = 0;i<15;i++){//12
            // pos inicial
            yDisp[i]=410;
        }
    }
    
    public void iniAltu(){
        
         /*
    
    NAME FUNCION: iniAltu
       
    DESCRIPTION:
    Funcion que toma la osicion de las naves
    enemigas y cambia su altura respecto a la otra flota
    de naves enemigas
    
    
    */
         // for para recorrer nuestro array
        for(int fila=0;fila<2;fila++){
            for(int columna=0;columna<5;columna++){
                // altura inicial
                YEnemi[fila][columna]=20;
                // con este condicional , nos pondra las naves a una altura de 120
                if(secFila){
                    YEnemi[fila][columna]=120;
                }
                
            }
            secFila=true;
        }
    }
    public void timeNave(){
         /*
    
    NAME FUNCION: timeNave
       
    DESCRIPTION:
    Funcion que toma la posicion de las naves
    enemigas como la del usuario para
    mantener su posicion
        
    RETURN VOID()
    
    */
        // cada 10 milisegundo se actualizara el timer
        t=new Timer(tiempoNve,new ActionListener(){
            // sobrescribimos nuestro metodo
            public void actionPerformed(ActionEvent e){
                /*
                    Para que nuestra nave no se vaya hasta la derecha
                    creamos un condicional , en caso de que sea menor se regresa
                    a la posicion de enmedio
                    */
                if(derNave && xNave<=440){
                    xNave+=5;
                }
                if(izquNave && xNave>=0){
                    xNave-=5;
                    
                }
                // disminuir la altura de las balas con un for
                for(int i =0;i<disparadas;i++){
                    if(yDisp[i]>=-20)
                        yDisp[i]-=3;
            }
            
                // repitnamos lo que tenemos en nuestrocomponente
                repaint();
            }
        });
    }
    public void intersectBala(){
        /*
            
                NAME:intersectBala
        
               Funcionamiento:
                Bucle de Q^3 que recorre nuestro array de naves enemigas
                para poder eliminarlas en caso de que las balas toquen
                a las naves enemigas
                
            */
            for(int i =0;i<2;i++){
                
                for(int j = 0;j<5;j++){
                    
                    for(int k =0;k<disparadas;k++){
                        
                        /*
                            Comrpobamos en caso de que una nave enmiga sea
                            impactada por una bala
                            para cambiar sus coordenadas
                        */
                        if(disparos[k].intersects(nveEnemigas[i][j])){
                            
                            /*
                                Cambiando las coordenadas de las balas
                                y naves enemigas , al momento de ser disparadas
                                se iran abajo de nuestro panel
                            */
                            yDisp[k] = -40;
                            YEnemi[i][j] = 600;
                            score+=puntos;
                            vivas[i][j]=0;
                    }
                }
            }
        }
    }
    public int reviewVivas(){
        /*
        Funcion encargada de recorreer el array de naves enmigas
        para verificar si estan muertas o no
        */
        for(int i =0;i<2;i++){
            for(int j = 0;j<5;j++){
                        /*
                        Si nuestra nave enemiga ya paso esta posicion 
                        significa que ya murio
                        */
                if(YEnemi[i][j]>=530){
                            vivas[i][j]=0;
                        }
                        
                        /*
                        Si aun hay una anve viva nos salimos de la funcion
                        */
                        if(vivas[i][j]==1){
                            return 1;
                        }
                        
                    }
                }
        /*
        Mandamos llamar nuesrra funcion
        para detener los timer y que termine el juego
        */
        gameOver();
        return 1;
    }
    public int restLives(){
        /*
        FUNCION ENCARGADA DE RESTAR LAS NAVES Y LAS VIDAS DEL USUARIO
        */
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                if(YEnemi[i][j]>=520 && vivas[i][j]==1){
                    lives-=1;
                    vivas[i][j]=0;
                    return 1;
                }
            }
        }
        return 1;
        
    }
    public void gameOver(){
        /*
        Funcion encargada de detenr los timers de nuestas naves
        */
        acabad=true;
        g2.drawString("\n LOSE GAME\n Press enter to continue\n",100,250);
        t.stop();
        enemi.stop();
    }
    // nuevo metodo con el cual creamos nuestra nave y sus atributos
    @Override
    public void paintComponent(Graphics g){
        // llamaremoas al padre de la clase paint y le pasamos rl parmetro g
        super.paintComponent(g);
        // creaoms un objeto en 2D casteando graphics
        g2 = (Graphics2D)g;
        // cambiamos el color de lo que esta pintando
        g2.setColor(Color.BLACK);
        // le damos el tamaño a nuestra nave
        nave = new Rectangle2D.Double(xNave,410,60,90);
        // procedemos a dibujarlo
        g2.fill(nave);
        
        // for para dibujar las naves que aun estan
        for(int i =0;i<disparadas;i++){
            disparos[i]= new Ellipse2D.Double(xDisp[i],yDisp[i],10,20);
            g2.fill(disparos[i]);
        }
        // si nuestras vidas son igual a 0 entonces paramos el timer 
        if(lives ==0){
            fin=true;
            t.stop();
            enemi.stop();
        }
        // LLAMADO DE FUNCIONES
        wwrite();
        iniEnemigas();
        reviewVivas();
        intersectBala();
        restLives();
        
        
        
    }
    
    public void wwrite(){
        /*
        Funcion encargada de generar la actualizacion de vidas , nivel etc 
        
        */
        // Establecemos los parametros que usareos para nuestras palabras
        g2.setFont(new Font("Arial",Font.ITALIC,16));
        g2.drawString("Level:    "+level,20,20);
        g2.drawString("Lives:    "+lives,150,20);
        g2.drawString("Score:    "+score,260,20);
        g2.drawString("Bullet:   "+bullet,370,20);
        // damos aviso al usuario para recargar
        if(contRec==5 && disparadas<15){
            g2.drawString("Presiona R para recargar",250,300);
        }
        if(fin){
            g2.drawString("You Lose , press M to restart",200,300);
        }
        
    }
    
    public void timeEnemigas(){
             /*
    
    NAME FUNCION: timeEnemigas
       
    DESCRIPTION:
    Funcion que toma la posicion de las naves
    enemigas y las empieza a ,over de izquierda a derecha
        
    
    
    */
         enemi=new Timer(tiempoEnemigas,new ActionListener(){
            // sobrescribimos nuestro metodo
            public void actionPerformed(ActionEvent e){
               
                /*
                Mediante estos condicionales indicamos
                la velociad de nuestras naves enemigas ,
                asi como la posicion en la que se mueven
                */
                if(derEnemigas){
                    movEn+=5;
                }
                if(movEn>=80){
                    derEnemigas=false;
                    izqEnemigas=true;
                    /*
                    despues de n ciclos que bajen nuestras naves enemigas
                    */
                    contCaer++;
                }
                if(izqEnemigas){
                    movEn-=5;
                }
                if(movEn<=-15){
                    derEnemigas=true;
                    izqEnemigas=false;
                }
                /* condicional que da la instruccion de que bajen las naves
                llamando a la funcion Atack
                */
                
                if(contCaer>=3){
                    Atack();
                }
                /*
                Creamos un for para recorrer nuestro array de naves enemigas
                y verificar si la nave del usuario choca con las naves enemigas
                entonces decir al usuario que perdio
                */
                for(int i =0;i<2;i++){
                    for(int j = 0;j<5;j++){
                        if(nave.intersects(nveEnemigas[i][j])){
                            System.out.println("Has perdido");
                            // paramos el timer
                            fin =true;
                            t.stop();
                            enemi.stop();
                        }
                    }
                }
                // repitnamos lo que tenemos en nuestrocomponente
                repaint();
            }
        });
    }
    
    
    
    public void iniEnemigas(){
             /*
    
    NAME FUNCION: iniEnemigas
       
    DESCRIPTION:
    Funcion que genera 10mnaves enemigas , mediante un for loop
    
    
             */
        enemigasAuX =0;
        enemigasAuY=0;
        // bucle para recorrer nuestro array y crear las 10 naves enemigas
        for(int filas=0;filas <2;filas++){
            for(int columnas=0;columnas<5;columnas++){
                /*
                Aumentamos nuestro tamaño para que se vayan bajando las naves
                enemigas
                */
                nveEnemigas[filas][columnas]= new Rectangle2D.Double(enemigasI+enemigasAuX+movEn,YEnemi[filas][columnas]+10,30,30);
                enemigasAuX+=80;
                g2.fill(nveEnemigas[filas][columnas]);
            }
            /*
            Nves regresan a posicion inicial y amuentan de 
            posicion
            */
            enemigasAuX =0;
            enemigasAuY=100;
        }
        repaint();
    }
    
    public void reiniciar(){
        /*
        Funcion que vuelve a poner a todas las variables en su valor inicial
        */
        level+=1;
        puntos+=100;
        bullet=15;
        secFila=false;
        contRec=0;
        fin=false;
        contCaer=0;
        caer=false;
        acabad=false;
        iniDisp();
        iniAltu();
        iniVivas();
        timeNave();
        t.start();
        enemi.start();
        
        if(level%2==0 && tiempoNve>=2){
            /*
            Al disminuir el tiempo se ejctua la velocidad
            */
            tiempoNve--;
        }
        if(tiempoEnemigas>=9){
            tiempoEnemigas-=8;
        }
        
    }
    public void perdistee(){
        /*
        Funcion encargada de reiniciar todos los atributos y las funciones
        */
        level=1;
        puntos=100;
        bullet=15;
        secFila=false;
        contRec=0;
        contCaer=0;
        caer=false;
        fin=false;
        acabad=false;
        iniDisp();
        iniAltu();
        iniVivas();
        timeNave();
        t.start();
        enemi.start();
        tiempoNve=10;
        tiempoEnemigas=90;
        
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    /*
    SECCION DE BOTONES
    */
    @Override
    public void keyPressed(KeyEvent e) {
        /*
        seccion encargada de el moviemineto del usuario 
        asi como de su actualizacion en caso de perder o ganar
        */
        if(e.getKeyCode() == KeyEvent.VK_D){
            derNave=true;
            izquNave=false;
        }
        if(e.getKeyCode() == KeyEvent.VK_A){
             derNave=false;
            izquNave=true;
        }
        
        if(e.getKeyCode() ==KeyEvent.VK_SPACE){
            /*
            
            contador en caso de que nos quedemos sin balas y 
            no exeder el tamaño del array de las balas

            */
            if(contRec<variable && disparadas<15){
                // guardamos en la posicion x
                xDisp[disparadas]= (int) nave.getCenterX();
                // una bala ya fue disparada 
                disparadas++;
                // restamos nuestras balas
                bullet-=1;
                // evitamos pasarnos de las 20 balas
                contRec++;
            }
        }
        /*
        Para que el usuario pueda recargar presionamos la R
        */
        if(e.getKeyCode() ==KeyEvent.VK_R ){
            /*
            Para evitar un bug y que no recargemosbalas infinitas usamos este condicional
            */
            if(contRec==5)
                contRec=0;
        }
        
        /*
        si el usuario presiona enter y nuestra variable acad es true entonces se reinicia el juego
        */
        if(e.getKeyCode()==KeyEvent.VK_ENTER && acabad ==true){
            reiniciar();
        }
        /*
        Si el usuario presiona M y nuestravariable fin es true
        entones mandamos a llamar a la funcion perdiste
        */
        if(e.getKeyCode()==KeyEvent.VK_M && fin ==true){
            perdistee();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
