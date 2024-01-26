// 4.3 Escreva quatro instruções Java
// diferentes que adicionam 1 à variável de inteiro x.

package cap4.exercicios.questoes;

public class Exercicio4_3 {
    public static void main(String[] args) {

        int x = 0;

        System.out.println(x++); //adiciona depois do println, mas adiciona
       // x = 0;
        System.out.println(++x); // o resultado é 2 por causa do primeiro incremento (pósfixado)
        x = 0;
        System.out.println( x + 1);
    }
}
