package cap5.exercicios.exerciciosDerevisao;
// a) Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for.
// Assuma que as variáveis de inteiro sum e count foram declaradas.
public class Exercicio5_3a {
    public static void main(String[] args) {
         int soma = 0;
         int contador;

         for(contador = 1; contador <= 99; contador++){
             soma += contador;
             System.out.printf("Linha %d: Soma = %d%n", contador, soma);
         }
    }
}
