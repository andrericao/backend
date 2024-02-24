package cap5.exercicios.questoes;
// 5.14(Programa de juros compostos modificado) Modifique o aplicativo de juros compostos da
// Figura 5.6 para repetir os passos para taxas de juros de 5%, 6%, 7%, 8%, 9% e 10%.
// Utilize um loop for para variar a taxa de juros.
public class Exercicio5_14 {
    public static void main(String[] args) {

        double montante; // quantia em depósito ao fim de cada ano
        double principal = 1000.0; // quantidade inicial antes dos juros
        double juros = 0.05; // taxa de juros

        // calcula quantidade de depósito para cada um dos dez anos
        for (int ano = 1; ano <= 10; ++ano){

            System.out.printf("%4d°%s%25s %n", ano, " Ano", "Quantia Acrescentada");

            while(juros <= 0.1){

                // calcula nova quantidade durante ano especificado
                montante = principal * Math.pow(1.0 + juros, ano);

                // exibe o ano e a quantidade
                System.out.printf("%8.2f%,20.2f%n", juros, montante);

                juros += 0.01;
            }

            juros = 0.05;
            System.out.println();
        }
    }
}
