package cap4.exercicios.imagemGrafica;

import javax.swing.*;

public class TestaPainelDesenho4_1b {
    public static void main(String[] args) {

        PainelDesenho4_1b painel = new PainelDesenho4_1b();

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;

        app.add(painel);
        app.setSize(450, 450);
        app.setVisible(true);
    }
}
