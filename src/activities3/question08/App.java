package activities3.question08;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountBank account = new AccountBank(1000.0);

        System.out.printf("Saldo atual: R$ %.2f%n", account.getBalance());
        System.out.print("Digite o valor do saque: R$ ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n", account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.printf("%s Saldo atual: R$ %.2f%n", e.getMessage(), account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.printf("%s Saldo atual: R$ %.2f%n", e.getMessage(), account.getBalance());
        }

        scanner.close();
    }
}
