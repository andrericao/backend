package cap4.exercicios.imagemGrafica;

import javax.swing.*;
import java.awt.*;

public class PainelDesenho4_1a extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

       // int width = getWidth();
        int height = getHeight();


        int c = 0;

        while(c < 450){
            g.drawLine(0, 0, c,  height - c);
            c += 30;
        }

        /*

        CÓDIGO ECONOMIZADO

        g.drawLine(0, 0, 0, height );
        g.drawLine(0, 0, 30,  height - 30);
        g.drawLine(0, 0, 60,  height - 60);
        g.drawLine(0, 0, 90,  height - 90);
        g.drawLine(0, 0, 120,  height - 120);
        g.drawLine(0, 0, 150,  height - 150);
        g.drawLine(0, 0, 180,  height - 180);
        g.drawLine(0, 0, 210,  height - 210);
        g.drawLine(0, 0, 240,  height - 240);
        g.drawLine(0, 0, 270,  height - 270);
        g.drawLine(0, 0, 300,  height - 300);
        g.drawLine(0, 0, 330,  height - 330);
        g.drawLine(0, 0, 360,  height - 360);
        g.drawLine(0, 0, 390,  height - 390);
        g.drawLine(0, 0, 420,  height - 420);
        g.drawLine(0, 0, 450,  height - 450);
        */
    }
}
