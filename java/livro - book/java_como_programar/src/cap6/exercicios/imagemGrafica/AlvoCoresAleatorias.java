package cap6.exercicios.imagemGrafica;

// 6.1 Utilizando o método fillOval, desenhe um alvo que alterna entre DUAS cores
// aleatórias, como na Figura 6.13. Utilize o construtor Color(int r, int g, int b)
// com argumentos aleatórios para gerar cores aleatórias.

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

public class AlvoCoresAleatorias extends JPanel{

    SecureRandom sr = new SecureRandom();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Color aleatoryColor1 = new Color(
                sr.nextInt(256),
                sr.nextInt(256),
                sr.nextInt(256));
        Color aleatoryColor2 = new Color(
                sr.nextInt(256),
                sr.nextInt(256),
                sr.nextInt(256));

        int diametroCirculo = 180;

        for (int i = 1; i <= 5; i++) {

            int raioCirculo = diametroCirculo / 2;

            if (i % 2 == 0) {
                g.setColor(aleatoryColor1);
                g.fillOval(
                         raioCirculo - 60,
                        raioCirculo - 60,
                        360 - diametroCirculo,
                        360 - diametroCirculo);
            } else {
                g.setColor(aleatoryColor2);
                g.fillOval(
                        raioCirculo - 60,
                        raioCirculo - 60,
                        360 - diametroCirculo,
                        360 - diametroCirculo);
            }

            diametroCirculo += 30;

        }
    }
}
