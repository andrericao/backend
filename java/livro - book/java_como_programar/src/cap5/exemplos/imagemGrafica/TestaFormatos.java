package cap5.exemplos.imagemGrafica;
// Figura 5.28: TestaFormatos.java
// Obtendo a entrada de usuário e criando um JFrame para exibir Formatos.
import javax.swing.*;

public class TestaFormatos {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog
                ("Digite 1 para retângulos\n" +
                        "Digite 2 para ovais.");

        int escolha = Integer.parseInt(input);

        Formatos fomato1 = new Formatos(escolha);

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(fomato1);
        app.setSize(300, 300);
        app.setVisible(true);


    }
}
