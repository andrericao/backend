package cap5.exercicios.imagemGrafica;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

public class FormatosAleatorios extends JPanel {
    SecureRandom sr = new SecureRandom();

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i = 1; i <= 10; i++){
            Color corAleatoria = new Color(
                    sr.nextInt(256),
                    sr.nextInt(256),
                    sr.nextInt(256));
            if(i % 2 == 0){
                g.setColor(corAleatoria);
                g.fillOval(
                        sr.nextInt(120),
                        sr.nextInt(120),
                        sr.nextInt(120),
                        sr.nextInt(120));
            } else {
                g.setColor(corAleatoria);
                g.fillRect(
                        sr.nextInt(120),
                        sr.nextInt(120),
                        sr.nextInt(120),
                        sr.nextInt(120));
            }

        }
    }
}
