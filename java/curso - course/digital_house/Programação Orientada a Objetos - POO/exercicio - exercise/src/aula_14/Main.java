package aula_14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador(7, "Carol", true, true);
        Jogador jogador2 = new Jogador(24, "Diego", true, true);
        Jogador jogador3 = new Jogador(5, "Ronaldo", false, false);
        Jogador jogador4 = new Jogador(45, "Yana", false, true);

        Equipe equipe = new Equipe("Turma1");

        equipe.addJogador(jogador1);
        equipe.addJogador(jogador2);
        equipe.addJogador(jogador3);
        equipe.addJogador(jogador4);

        equipe.mostrarJogadoresTitulares();

        System.out.println("Quantidade de jogadores lesionados: " + equipe.getQuantidadeJogadoresLesionados());

        jogador4.compareTo(jogador1);
        jogador1.compareTo(jogador3);
    }
}
