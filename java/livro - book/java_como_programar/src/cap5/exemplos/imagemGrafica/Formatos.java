package cap5.exemplos.imagemGrafica;

import javax.swing.*;
import java.awt.*;

public class Formatos extends JPanel {

    private int escolha;

    public Formatos(int escolhaDoUsuario){
        escolha = escolhaDoUsuario;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (int i = 0; i < 10; i++){

            switch (escolha){
                case 1:
                    g.drawRect(10 + i * 10,
                               10 + i * 10,
                            50 + i * 10,
                            50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10,
                               10 + i * 10,
                            50 + i * 10,
                            50 + i * 10);
            }
        }
    }

}
