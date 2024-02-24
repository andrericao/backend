package cap5.exercicios.questoes;

// 5.12(Calculando o produto de números inteiros ímpares)
// Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15.

public class Exercicio5_12 {
    public static void main(String[] args) {

        int produto = 1;

        for(int i = 3; i <= 15; i += 2){
            produto *= i;
            System.out.printf("Produto é: %,d%n", produto);
        }

    }
}
