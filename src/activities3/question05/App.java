package activities3.question05;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Abrindo arquivo...");

        try {
            System.out.print("Digite o dado lido do arquivo: ");
            String text = scanner.nextLine();
            int number = Integer.parseInt(text);

            System.out.println("Número lido: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Erro: o dado do arquivo não é um número válido.");
        } finally {
            System.out.println("Arquivo fechado.");
            scanner.close();
        }
    }
}
