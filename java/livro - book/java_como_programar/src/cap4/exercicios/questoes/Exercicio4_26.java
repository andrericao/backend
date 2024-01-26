package cap4.exercicios.questoes;

public class Exercicio4_26 {
    public static void main(String[] args){

        int row = 10;
        while (row >= 1){
            int column = 1;
            while (column <= 10){
                // Primeiro o programa desenha esse loop até "column atingir valor dez
                // Ou seja ele repete o sinal de maior dez vezes antes de decrementar a literal "row" em uma unidade
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;
            }
            --row;
            System.out.println();
        }
    }
}