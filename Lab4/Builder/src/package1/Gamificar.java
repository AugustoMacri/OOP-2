package package1;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Gamificar extends JFrame{

    JFrame frame;
    JLabel display;
    ImageIcon image;


    ImageIcon iconFundo = new ImageIcon(getClass().getResource("mapa.jpg"));//trocar arquivos
    ImageIcon iconStatic = new ImageIcon(getClass().getResource("stickParado.png"));
    ImageIcon iconMovendo = new ImageIcon(getClass().getResource("ezgif.com-video-to-gif.gif"));

    JLabel lFundo = new JLabel(iconFundo);
    JLabel lPersonagem = new JLabel(iconStatic);


    //construtor
    public Gamificar(){
        editarJanela();
        editarComponentes();
        addMovimento();
    }

    public void addMovimento(){
        addKeyListener(new KeyListener() {
            
            public void keyTyped(KeyEvent e) {
                
            }

           
            public void keyPressed(KeyEvent e) {

                lPersonagem.setIcon(iconMovendo);

                if(e.getKeyCode()==38){
                    stickPosY -= 10;
                }
                if(e.getKeyCode()==40){
                    stickPosY += 10;
                }
                if(e.getKeyCode()==37){
                    stickPosX -= 10;
                }
                if(e.getKeyCode()==39){
                    stickPosX += 10;
                }
                lPersonagem.setBounds(stickPosX, stickPosY, 103, 202);
            }

            
            public void keyReleased(KeyEvent e) {
                lPersonagem.setIcon(iconStatic);
            }
        });
    }

    int stickPosX = 200;
    int stickPosY = 200;

     
    public void editarComponentes(){
        lFundo.setBounds(0, 0, 800, 500);
        lPersonagem.setBounds(stickPosX, stickPosY, 103, 202);
    }
    

    public void editarJanela(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        add(lPersonagem);
        add(lFundo);
    }


    public void chamada(){
        new Gamificar();
    }
   
}

