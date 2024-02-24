package cap5.exercicios.exerciciosDeRevisao;
// c) Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora i.
// Assuma que a variável i foi declarada, mas não foi inicializada. Imprima apenas cinco inteiros por linha.
// [Dica: utilize o cálculo i % 5. Quando o valor dessa expressão for 0, imprima um caractere de nova linha;
// caso contrário, imprima um caractere de tabulação. Assuma que esse código é um aplicativo. Utilize ométodo
// System.out.println () para imprimir o caractere de nova linha, e utilize o método System.out.print ('\t') para
// imprimir o caractere de tabulação.]

// Repita a parte (c) utilizando uma instrução for.
public class Exercicio5_3d {
    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++){
            if(i % 5 == 0){
                System.out.printf("%d", i);
                System.out.println();
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
