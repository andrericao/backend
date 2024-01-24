package cap4.exercicios;
// 4.33 (Múltiplos de 2 com um loop infinito) Escreva um aplicativo
// que continue exibindo na janela de comando os múltiplos do inteiro 2
// a saber, 2, 4, 8, 16, 32, 64 e assim por diante.
// Seu loop não deve terminar (isto é, deve criar um loop infinito).

// O que acontece quando você executa esse programa?
public class Exercicio4_33 {

    public static void main(String[] args) {

        long i = 0;
        while(i >= 0 ) { // loop infinito
       // while(i <= 100){ // loops para teste

            System.out.println((long) Math.pow(2, i));
            i++;
        }
    }
}
