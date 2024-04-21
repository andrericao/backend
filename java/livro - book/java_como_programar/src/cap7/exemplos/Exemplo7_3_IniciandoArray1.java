package cap7.exemplos;

// Figura 7.3: InitArray.java
// Inicializando os elementos de um array com um inicializador de array.
public class Exemplo7_3_IniciandoArray1 {

    public static void main(String[] args) {
        // A lista de inicializador especifica o valor inicial de cada elemento
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna
        // gera saída do valor de cada elemento do array
        for (int contador = 0; contador < array.length; contador++)
            System.out.printf("%5d%8d%n", contador, array[contador]);
    } // fim da classe InitArray
}