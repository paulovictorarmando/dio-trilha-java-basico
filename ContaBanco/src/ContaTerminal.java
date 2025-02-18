import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //criar o scanner
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();

        scanner.nextLine(); //limpar o baffer depois de ler int

        System.out.print("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // MOstrar dados
        System.out.println("\nDados da conta cadastrada:");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo inicial: R$ " + saldo);

        // Fecha o scanner
        scanner.close();

    }
}