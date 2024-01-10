package cap4.exercicios.imagemGrafica;

import javax.swing.*;

public class TestaPainelDesenho {
    public static void main(String[] args) {

        PainelDesenho painel = new PainelDesenho();

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;

        app.add(painel);
        app.setSize(450, 450);
        app.setVisible(true);
    }
}
