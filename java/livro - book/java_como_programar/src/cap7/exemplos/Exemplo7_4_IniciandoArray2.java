package cap7.exemplos;

public class Exemplo7_4_IniciandoArray2 {

    public static void main(String[] args){
        final int ARRAY_LENGTH = 10; // declara constante
        int[] array = new int[ARRAY_LENGTH]; // cria o array

        // calcula valor de cada elemento do array
        for (int contador = 0; contador < array.length; contador++)
            array[contador] = 2 + 2 * contador;

        System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna

        // gera saída do valor de cada elemento do array
        for (int contador = 0; contador < array.length; contador++)
            System.out.printf("%5d%8d%n", contador, array[contador]);
    }
}
