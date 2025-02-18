import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita e lê o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();

        // Limpa o buffer antes de ler a string (evita problemas com `nextLine` após `nextInt`)
        scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Exibe os dados coletados
        System.out.println("\nDados da conta cadastrada:");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo inicial: R$ " + saldo);

        // Fecha o scanner
        scanner.close();

    }
}