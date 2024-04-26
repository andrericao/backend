package cap7.exemplos;

public class Exemplo7_13_PassandoArrayComoParametros {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };

        System.out.printf("Efeitos da passagem de referência para todo o array:%n" +
                          "Os valores da matriz original são:%n");

        // saída do array original
        for(int valor : array ){
            System.out.printf(" %d", valor);
        }

        modificaArray(array);
        System.out.printf("%n%nOs valores do array modificados são:%n");

        // saída do array modificado
        for(int valor : array ){
            System.out.printf(" %d",valor);
        }

        System.out.printf("%n%nEfeitos da passagem do valor do elemento da matriz:%n" +
                          "array[3] antes da método modificaElemento: %d%n", array[3]);

        modificaElemento(array[3]);
        System.out.printf("array[3] depois do método modificaElemento %d%n", array[3]);
    }

    public static void modificaArray(int[] array2){
        for(int contador = 0; contador < array2.length; contador++){
            array2[contador] *= 2;
        }
    }

    public static void modificaElemento(int elemento){
        elemento *= 2;
        System.out.printf("Valor do elemneto no modificaElemento: %d%n", elemento);
    }
}
