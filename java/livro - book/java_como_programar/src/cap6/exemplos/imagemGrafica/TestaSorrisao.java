package cap6.exemplos.imagemGrafica;

import javax.swing.JFrame;

public class TestaSorrisao {
    public static void main(String[] args) {
        Sorrisao panel = new Sorrisao();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
