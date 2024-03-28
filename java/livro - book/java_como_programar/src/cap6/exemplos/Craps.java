package cap6.exemplos;

// Você lança dois dados. Cada dado tem seis faces que contêm um, dois, três, quatro, cinco e seis pontos
// respectivamente. Depois que os dados param de rolar, a soma dos pontos nas faces viradas para cima é calculada.
// Se a soma for 7 ou 11 no primeiro lance, você ganha. Se a soma for 2, 3 ou 12 no primeiro lance (chamado
// “craps”), você perde (isto é, a “casa” ganha). Se a soma for 4, 5, 6, 8, 9 ou 10 no primeiro lance, essa soma torna-
// -se sua “pontuação”. Para ganhar, você deve continuar a rolar os dados até “fazer sua pontuação” (isto é, obter
// um valor igual à sua pontuação). Você perde se obtiver um 7 antes de fazer sua pontuação.

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom sr = new SecureRandom();

    private enum Status { CONTINUE, WON, LOST }

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int meusPontos = 0;
        Status gameStatus;

        int somaDeLancamentos = lancarDados();

        switch(somaDeLancamentos){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                meusPontos = somaDeLancamentos;
                System.out.printf("Minha pontuação é %d%n", meusPontos);
        }

        while(gameStatus == Status.CONTINUE){
            somaDeLancamentos = lancarDados();

            if (somaDeLancamentos == meusPontos) {
                gameStatus = Status.WON;
            } else {
                if(somaDeLancamentos == SEVEN){
                    gameStatus = Status.LOST;
                }
            }
        }

        if (gameStatus == Status.WON){
            System.out.println("Você Ganhou");
        } else {
            System.out.println("Você Perdeu");
        }
    }

    public static int lancarDados(){
        int lancar_1 = 1 + sr.nextInt(6);
        int lancar_2 = 1 + sr.nextInt(6);

        int soma = lancar_1 + lancar_2;

        System.out.printf("Dado 1: %d e dado 2: %d.\nSoma: %d%n", lancar_1, lancar_2, soma);

        return soma;
    }


}
