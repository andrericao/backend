package cap6.exercicios.imagemGrafica;

import javax.swing.*;

public class TestaAlvoCoresAleatoria {

    public static void main(String[] args) {
        AlvoCoresAleatorias panel = new AlvoCoresAleatorias();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250, 280);
        app.setVisible(true);
    }
}
