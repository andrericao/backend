package cap4.exercicios.imagemGrafica;

import javax.swing.*;

public class TestaPainelDesenho2 {
    public static void main(String[] args) {

        PainelDesenho2 painel = new PainelDesenho2();

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;

        app.add(painel);
        app.setSize(450, 450);
        app.setVisible(true);
    }
}
