package cap3.imagemGrafica.exemplos;

import javax.swing.*;

//Figura 3.13
public class Dialogo2 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        String mensagem =
                String.format("Seja bem vindo %s, a Programação Java!", nome);

        JOptionPane.showMessageDialog(null, mensagem);

    }
}
