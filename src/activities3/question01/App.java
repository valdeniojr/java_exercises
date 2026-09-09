package activities3.question01;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o dividendo: ");
            int dividend = scanner.nextInt();

            System.out.print("Digite o divisor: ");
            int divisor = scanner.nextInt();

            int result = dividend / divisor;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
