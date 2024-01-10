package cap4.exercicios.imagemGrafica;

import java.awt.*;
import javax.swing.*;

public class PainelDesenho2 extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        // vértice canto esquerdo superior
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

        // vértice canto direito inferior
        g.drawLine(0, height, width, height );
        g.drawLine(30, height - 30, width, height );
        g.drawLine(60, height - 60, width, height);
        g.drawLine(90, height - 90, width, height);
        g.drawLine(120, height - 120, width, height);
        g.drawLine(150, height - 150, width, height);
        g.drawLine(180, height - 180, width, height);
        g.drawLine(210, height - 210, width, height);
        g.drawLine(240, height - 240, width, height);
        g.drawLine(270, height - 270, width, height);
        g.drawLine(300, height - 300, width, height);
        g.drawLine(330, height - 330, width, height);
        g.drawLine(360, height - 360, width, height);
        g.drawLine(390, height - 390, width, height);

        // vértice canto esquerdo inferior
        g.drawLine(width, 0 , width, height );
        g.drawLine(width, 0,  width - 30,  height - 30 );
        g.drawLine(width, 0,  width - 60,  height - 60 );
        g.drawLine(width,  0, width - 90,  height - 90);
        g.drawLine(width,  0, width - 120, height - 120);
        g.drawLine(width,  0, width - 150, height - 150);
        g.drawLine(width,  0, width - 180, height - 180);
        g.drawLine(width,  0, width - 210, height - 210);
        g.drawLine(width,  0, width - 240, height - 240);
        g.drawLine(width,  0, width - 270, height - 270);
        g.drawLine(width,  0, width - 300, height - 300);
        g.drawLine(width,  0, width - 330, height - 330);
        g.drawLine(width,  0, width - 360, height - 360);
        g.drawLine(width,  0, width - 390, height - 390);

        // vértice canto  superior
        g.drawLine(0, height, width, height );
        g.drawLine(0, height, width - 30, height - 30 );
        g.drawLine(0, height, width - 60, height - 60 );
        g.drawLine(0, height, width - 90, height - 90);
        g.drawLine(0, height, width - 120,height - 120);
        g.drawLine(0, height, width - 150,height - 150);
        g.drawLine(0, height, width - 180,height - 180);
        g.drawLine(0, height, width - 210,height - 210);
        g.drawLine(0, height, width - 240,height - 240);
        g.drawLine(0, height, width - 270,height - 270);
        g.drawLine(0, height, width - 300,height - 300);
        g.drawLine(0, height, width - 330,height - 330);
        g.drawLine(0, height, width - 360,height - 360);
        g.drawLine(0, height, width - 390,height - 390);


    }
}
