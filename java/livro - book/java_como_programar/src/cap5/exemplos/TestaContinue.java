package cap5.exemplos;

public class TestaContinue {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 10; contador++){
            if (contador == 5)
                continue;
            System.out.printf("%d ", contador);
        }
        System.out.printf("%nCom o 'continue' o programa só deixou de imprimir o número 5%n");
    }
}
