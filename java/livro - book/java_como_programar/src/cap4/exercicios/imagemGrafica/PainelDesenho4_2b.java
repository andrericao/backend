package cap4.exercicios.imagemGrafica;

import javax.swing.*;
import java.awt.*;

public class PainelDesenho4_2b extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int c = 30;

        while(c < 450){
            g.drawLine(0, c, c,  height);
            g.drawLine(width, c, width - c,  height);
            g.drawLine(width, c, c,  0);
            g.drawLine(0, c, width - c,  0);

            c += 30;
        }
    }
}
