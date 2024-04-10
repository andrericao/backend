package cap5.exercicios.imagemGrafica;

import javax.swing.*;

public class TestaFormatosAleatorios {
    public static void main(String[] args) {
        FormatosAleatorios panel = new FormatosAleatorios();

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
