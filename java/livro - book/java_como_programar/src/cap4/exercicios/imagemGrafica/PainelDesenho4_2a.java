package cap4.exercicios.imagemGrafica;

import javax.swing.*;
import java.awt.*;

public class PainelDesenho4_2a extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int c = 30;

        while(c < 450){
            g.drawLine(0, c, c,  height);

            c += 30;
        }
    }
}
