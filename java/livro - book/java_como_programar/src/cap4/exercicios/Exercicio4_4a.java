package cap4.exercicios;

// Escreva instruções Java para realizar cada uma das seguintes tarefas:
//  a) Utilize uma instrução para atribuir a soma de x e y a z,
//      em seguida, incremente x por 1.
//  b) Teste se a variável contador é maior do que 10.
//      Se for, imprima "Contador é maior que 10".
//  c) Utilize uma instrução para decrementar a variável x por 1,
//      então subtraia-o da       variável total e armazene o resultado na variável total.
//  d) Calcule o resto após q ser dividido por divisor e atribua o resultado a q.
//      Escreva essa instrução de duas maneiras diferentes.
public class Exercicio4_4a {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;

        int soma = x++ + y + z;

        System.out.println(soma);
    }
}
