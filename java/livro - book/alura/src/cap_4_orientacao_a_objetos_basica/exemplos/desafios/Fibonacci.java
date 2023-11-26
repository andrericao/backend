package cap_4_orientacao_a_objetos_basica.exemplos.desafios;

public class Fibonacci {
    int calculaFibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
        }
    }

    int calculaFibonacci2(int n){
        return n < 2 ? n : calculaFibonacci2(n - 1) + calculaFibonacci2(n - 2);
    }

    int FibonacciIterativo(int termo) {
        int termo1 = 1, fibo = 0, temp = 0;
        for (int cont = 1;cont <= termo-1; cont++) {
            temp = fibo; //faz o giro, a variável temp serve somente para que não sejam perdidos valores
            fibo += termo1; //observe, são necessárias 3 variáveis
            termo1 = temp;
            System.out.print(fibo);
        }
        return fibo;
    }
}
