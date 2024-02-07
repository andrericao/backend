package cap4.exercicios.fazendoADiferenca;
// 4.39 (Crescimento demográfico mundial) A população mundial cresceu
// consideravelmente ao longo dos séculos. O crescimento contínuo
// pode, por fim, desafiar os limites de ar respirável, água potável,
// terra fértil para agricultura e outros recursos limitados. Há evidência
// de que o crescimento tem reduzido a velocidade nos últimos anos e
// que a população mundial pode chegar ao ponto máximo em algum momento
// nesse século e, então, começar a diminuir.


// Para esse exercício, pesquise questões de crescimento demográfico
// mundial on-line. Não deixe de investigar vários pontos de vista.
// Obtenha estimativas da população mundial atual e sua taxa de crescimento
// (a porcentagem pela qual provavelmente aumentará neste ano).
//
// Escreva um programa que calcule o crescimento demográfico mundial anual dos
// próximos 75 anos, utilizando a premissa simplificadora de que a taxa de
// crescimento atual ficará constante. Imprima os resultados em uma tabela.
// A primeira coluna deve exibir os anos do ano 1 ao ano 75. A segunda
// coluna deve exibir a população mundial esperada no fim desse ano.
// A terceira deve exibir o aumento numérico na população mundial que
// ocorreria nesse ano. Utilizando os seus resultados, determine o ano
// em que a população dobraria com relação ao número de hoje se a
// taxa de crescimento do ano atual persistisse.

public class Exercicio4_39 {
    public static void main(String[] args) {

        float taxaDecrecimeto = 0.0033F;
        int i = 0;
        float populacaoAtual = 8_000_000_000F;
        float crescimentoAnual = 0F;
        int anoAtual = 2024;


        while (i < 76) {

            if (i == 0) {
                System.out.println("Numeral   ||   Ano   ||   População Mundial   ||   Crescimento Anual");
                System.out.println("-".repeat(70));
                System.out.println("Atualmente   ||   2024   ||    8,000,000,000   ||   0  ");
            } else if(populacaoAtual == 2 * 8_000_000_000F) {
                anoAtual += 1;
                crescimentoAnual = populacaoAtual * taxaDecrecimeto;
                populacaoAtual += crescimentoAnual;
                System.out.println("População dobraria este ano!");
                System.out.printf("    %d°      ||   %d   ||    %.0f   ||   %.0f%n", i, anoAtual, populacaoAtual, crescimentoAnual);
            } else {
                anoAtual += 1;
                crescimentoAnual = populacaoAtual * taxaDecrecimeto;
                populacaoAtual += crescimentoAnual;
                System.out.printf("  %4d°      ||   %4d   ||    %,.0f   ||   %,4.0f%n", i, anoAtual, populacaoAtual, crescimentoAnual);
            }
            i++;
        }

    }
}
