import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int saldoDisponivel = new Random().nextInt(500, 20000);

        System.out.println("Insira seus dados\n ");
        System.out.print("Seu nome: ");

        String nome = leitor.next();
        nome = nome.substring(0, 1).toUpperCase().concat(nome.substring(1));

        System.out.println("**************************************");
        System.out.println("        Dados do cliente\n");

        System.out.println("Nome:              " + nome);
        System.out.println("Tipo de conta:     Corrente");
        System.out.println("Saldo disponivel:  R$ " + saldoDisponivel);
        System.out.println("**************************************\n\n");

        System.out.println("Operações\n");

        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair\n");

        System.out.println("Digite a opção desejada: ");

                 int opcaoDesejada = leitor.nextInt();

            if (opcaoDesejada == 1) {
                System.out.println("Seu saldo: " + saldoDisponivel);
            };


                if (opcaoDesejada == 2) {
                    System.out.print("digite o valor a ser recebido: ");
                    int valorReceber = leitor.nextInt();

                    int saldoAtualizado = valorReceber + saldoDisponivel;

                    System.out.println("Saldo atualizado: " + saldoAtualizado);

                }



                int valorTransferir = 0;
            if (opcaoDesejada == 3) {

                System.out.println("Digite o valor a ser transferido: ");
                valorTransferir = leitor.nextInt();

            } if (valorTransferir > saldoDisponivel) {
                System.out.println("Você não tem saldo suficiente ");

            } else if (opcaoDesejada == 32){
                int saldoAtualizado = saldoDisponivel - valorTransferir;
                System.out.print("Você enviou com Sucesso \n\nSeu saldo atual é: " + saldoAtualizado);
            };


    }
}