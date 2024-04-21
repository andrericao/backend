package cap7.exemplos.exemplo7_9_cartas;

import java.security.SecureRandom;

public class BaralhoDeCartas {

    private Carta[] baralho;
    private int cartaAtual; // índice da próxima Card a ser distribuída (0-51)
    private static final int NUMERO_DE_CARTAS = 52;
    private static final SecureRandom sr = new SecureRandom();

    public BaralhoDeCartas(){
        String[] valores = { "Ás", "Duque", "Terno", "Quadra", "Quina", "Sena",
                "Sete", "Oito", "Nove", "Dez", "Valete", "Rainha", "Rei" };

        String[] naipe = { "Copas", "Paus", "Espadas", "Ouros"};

        baralho = new Carta[NUMERO_DE_CARTAS]; // cria array de cartas
        //cartaAtual = 0;

        // preenche baralho com objetos Cartas
        for(int contador = 0; contador < baralho.length; contador++){
            baralho[contador] =
                    new Carta(valores[contador % 13], naipe[contador / 13]);

        }
    }

    public void embaralhar(){ // shuffle
        //cartaAtual = 0;

        // USEI FOR APRIMORADO PARA TESTAR
        for(Carta cartaDoBaralho : baralho){
        // for(int primeiro = 0; primeiro < baralho.length; primeiro++){

            int cartaAleatoria = sr.nextInt(NUMERO_DE_CARTAS);

            Carta temp = cartaDoBaralho;
            cartaDoBaralho = baralho[cartaAleatoria];
            baralho[cartaAleatoria] = temp;
        }
    }

    public Carta distribuidorCartas() {

        // determina se ainda há Cartas a serem distribuídas
        if(cartaAtual < baralho.length){ // retorna Carta atual no array
            return baralho[cartaAtual++];
        } else {
            return null; // retorna nulo para indicar que todos as Cartas foram distribuídas
        }
    }
}
