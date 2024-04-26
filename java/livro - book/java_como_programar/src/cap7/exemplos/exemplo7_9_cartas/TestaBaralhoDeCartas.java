package cap7.exemplos.exemplo7_9_cartas;

public class TestaBaralhoDeCartas {
    public static void main(String[] args) {
        BaralhoDeCartas baralho1 = new BaralhoDeCartas();
        baralho1.embaralhar(); // muda carta para aleatório -> gera uma única carta

        System.out.println();

        for(int i = 1; i <= 52; i++){
            System.out.printf("%02d - %-20s", i, baralho1.distribuidorCartas());
            if(i % 4 == 0){
                System.out.println();
            }
        }
    }
}
