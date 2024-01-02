package cap3.estudoCasoOpcional.exercicio;

import javax.swing.*;

//Adaptação para javax da figura 2.7
public class AdaptandoExercicioCap2 {

    public static void main(String[] args) {

        String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String segundoNnumero = JOptionPane.showInputDialog("Digite o segundo número: ");

        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNnumero);

        int soma = numero1 + numero2;

        String mensagem =
                String.format("A soma de %s mais %s é igual a %s!", numero1, numero2, soma);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
