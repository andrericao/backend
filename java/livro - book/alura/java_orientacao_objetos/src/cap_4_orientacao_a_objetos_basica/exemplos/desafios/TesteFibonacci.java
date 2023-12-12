package cap_4_orientacao_a_objetos_basica.exemplos.desafios;


// O parametrô acaba tendo o valor de "i" que aumenta a cada iteração

public class TesteFibonacci {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        for (int i = 1; i < 7; i++) {
            int resultado = fibonacci.calculaFibonacci2(i);
            System.out.println("(" + i + "): " + resultado + "\t");

        }

        fibonacci.FibonacciIterativo(7);
    }

}
