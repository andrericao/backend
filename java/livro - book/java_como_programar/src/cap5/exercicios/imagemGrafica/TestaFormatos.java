package cap5.exercicios.imagemGrafica;

import javax.swing.*;

public class TestaFormatos {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog
                ("Digite o diâmtro dos círculos: ");

        int diametro = Integer.parseInt(input);

        Formatos formato = new Formatos(diametro);
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(formato);
        app.setSize(400, 400);
        app.setVisible(true);
    }
}
