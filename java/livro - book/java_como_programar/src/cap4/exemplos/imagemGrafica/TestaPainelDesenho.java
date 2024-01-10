package cap4.exemplos.imagemGrafica;

import javax.swing.*;

public class TestaPainelDesenho {
    public static void main(String[] args) {

        // cria um painel que contém nosso desenho
        PainelDesenho painel = new PainelDesenho();

        // cria um novo quadro para armazenar o painel
        JFrame app = new JFrame();

        // configura o frame para ser encerrado quando ele é fechado
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;

        app.add(painel);                       // adiciona painel ao frame
        app.setSize(400, 350); // configura o tamanho do frame
        app.setVisible(true);              // torna frame viśivel



    }
}
