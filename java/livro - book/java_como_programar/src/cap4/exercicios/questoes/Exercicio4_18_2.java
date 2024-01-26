package cap4.exercicios.questoes;
// COPIEI DA INTERNET , MAS AINDA NÃO ENTENDI O EXERCÍCIO
import java.util.Scanner;

public class Exercicio4_18_2 {
        public void Recibe() {


            int numeroConta;
            double saldoInicio;
            double despesas;
            double limiteCredito;


            Scanner input = new Scanner(System.in);

            System.out.println("Digite o número da conta ou digite -1 para sair: \n");
            numeroConta = input.nextInt();

            System.out.println("Digite o saldo Inicial: \n");
            saldoInicio = input.nextDouble();

            System.out.println("Digite a despesa: \n");
            despesas = input.nextDouble();

            System.out.println("Digite o crédito inicial: \n");
            limiteCredito = input.nextDouble();

            while (numeroConta != -1){

                double x = Recebe(saldoInicio, despesas, limiteCredito);
                if( x - limiteCredito > 0) {
                    System.out.println("Crédito Excedido!");
                }

                System.out.println("Digite o número da conta ou digite -1 para sair: \n");
                numeroConta = input.nextInt();

            }
        }

        public double Recebe( double saldoInic, double despesas, double limiteCredito){
            // Abre metodo Retorna
            return saldoInic + despesas - limiteCredito;
        }

        public static void main(String[] args) {
            Exercicio4_18_2 exer4_18 = new Exercicio4_18_2();

            exer4_18.Recibe();
        }
    }
