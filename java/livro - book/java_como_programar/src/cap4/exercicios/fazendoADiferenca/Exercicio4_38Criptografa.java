package cap4.exercicios.fazendoADiferenca;

import java.util.Scanner;

// 4.38 (Impondo privacidade com criptografia) O crescimento explosivo de comunicação
// e armazenamento de dados na internet e em computadores conectados por ela aumentou
// muito a preocupação com a privacidade. O campo da criptografia envolve a
// codificação de dados para torná-los difíceis de acessar (e espera-se — com os
// esquemas mais avançados — impossíveis de acessar) para usuários sem autorização de
// leitura. Nesse exercício, você investigará um esquema simples para criptografar e
// descriptografar dados.
//
// Uma empresa que quer enviar dados pela internet pediu-lhe que escrevesse um
// programa que criptografe dados a fim de que eles possam ser transmitidos com
// maior segurança. Todos os dados são transmitidos como inteiros de quatro dígitos.
//
// Seu aplicativo deve ler um inteiro de quatro dígitos inserido pelo usuário e
// criptografá-lo da seguinte maneira: substitua cada dígito  pelo resultado da
// adição de 7 ao dígito, obtendo o restante depois da divisão do novo valor por 10.
//
// Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto.
// Então, imprima o inteiro criptografado. Escreva um aplicativo separado que receba
// a entrada de um inteiro de quatro dígitos criptografado e o descriptografe
// (revertendo o esquema de criptografia) para formar o número original.

// [Projeto de leitura opcional: pesquise a “criptografia de chave pública” em
// geral e o esquema de chave pública específica PGP (Pretty Good Privacy).
// Você também pode querer investigar o esquema RSA, que é amplamente usado em
// aplicativos robustos industriais.]

// EXEMPLO COM NÚMERO 2567 QUE GERA O 3492
public class Exercicio4_38Criptografa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número de 4 dígitos: ");
        int numero = input.nextInt();

        // int aux = numero;
        int i = 0;
        int digito = 0;
        int novoDigito = 0;

        while(i < 4){
            System.out.printf("valor de número: %d%n", numero);
            digito = (numero % 10) + 7;
            System.out.printf("Último dígito somando por 7: %d%n", digito);
            digito %= 10;
            System.out.printf("Último dígito de digito: %d%n", digito);
            numero /= 10;

            if(i == 0){
                // Trocando o primeiro dígito pelo terceiro e o segundo pelo quarto.
                novoDigito = digito * 100;
            } else if (i == 1){
                novoDigito += digito * 1_000;
            } else if (i == 2) {
                novoDigito += digito;
            } else if (i == 3){
                novoDigito += digito * 10;
            }

            i++;
        }

        System.out.printf("Dígito criptografado: %d%n", novoDigito);
    }


}
