package activities3.question04;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        String text1 = scanner.nextLine();

        System.out.print("Digite o segundo número: ");
        String text2 = scanner.nextLine();

        try {
            int number1 = Integer.parseInt(text1);
            int number2 = Integer.parseInt(text2);
            int result = number1 / number2;

            System.out.println("Resultado da divisão: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Informe apenas números inteiros.");
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
