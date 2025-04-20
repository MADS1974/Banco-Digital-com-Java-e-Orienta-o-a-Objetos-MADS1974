import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Marcio Adriano");

        Conta contaCorrente = new ContaCorrente(1, cliente1, 500);
        Conta contaPoupanca = new ContaPoupanca(2, cliente1);

        while (true) {
            System.out.println("\n=== Menu do Banco ===");
            System.out.println("1. Depositar na Conta Corrente");
            System.out.println("2. Depositar na Conta Poupanca");
            System.out.println("3. Transferir da Conta Corrente para a Poupanca");
            System.out.println("4. Aplicar Juros na Conta Poupanca");
            System.out.println("5. Exibir Extrato da Conta Corrente");
            System.out.println("6. Exibir Extrato da Conta Poupanca");
            System.out.println("7. Exibir Historico da Conta Corrente");
            System.out.println("8. Exibir Historico da Conta Poupanca");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depositar na Conta Corrente: ");
                    double valorCC = scanner.nextDouble();
                    contaCorrente.depositar(valorCC);
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar na Conta Poupanca: ");
                    double valorCP = scanner.nextDouble();
                    contaPoupanca.depositar(valorCP);
                    break;
                case 3:
                    System.out.print("Digite o valor para transferir da Conta Corrente para a Poupanca: ");
                    double valorTransferencia = scanner.nextDouble();
                    contaCorrente.transferir(valorTransferencia, contaPoupanca);
                    break;
                case 4:
                    System.out.print("Digite a taxa de juros (%): ");
                    double taxa = scanner.nextDouble();
                    ((ContaPoupanca) contaPoupanca).aplicarJuros(taxa);
                    break;
                case 5:
                    contaCorrente.imprimirExtrato();
                    break;
                case 6:
                    contaPoupanca.imprimirExtrato();
                    break;
                case 7:
                    contaCorrente.imprimirHistorico();
                    break;
                case 8:
                    contaPoupanca.imprimirHistorico();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}