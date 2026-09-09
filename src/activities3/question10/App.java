package activities3.question10;

import java.util.Scanner;

public class App {
    private static void showMenu() {
        System.out.println("\n===== CALCULADORA =====");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static double divide(double n1, double n2)
            throws DivisionForZeroException {
        if (n2 == 0) {
            throw new DivisionForZeroException("Não é possível dividir por zero.");
        }

        return n1 / n2;
    }

    private static double readNumber(Scanner scanner, String message) {
        System.out.print(message);
        return Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executable = true;

        while (executable) {
            try {
                showMenu();
                int option = Integer.parseInt(scanner.nextLine().trim());

                if (option == 5) {
                    executable = false;
                    System.out.println("Calculadora encerrada.");
                    continue;
                }

                if (option < 1 || option > 5) {
                    System.out.println("Opção inválida! Escolha uma opção entre 1 e 5.");
                    continue;
                }

                double n1 = readNumber(scanner, "Digite o primeiro número: ");
                double n2 = readNumber(scanner, "Digite o segundo número: ");
                double result;

                switch (option) {
                    case 1:
                        result = n1 + n2;
                        break;
                    case 2:
                        result = n1 - n2;
                        break;
                    case 3:
                        result = n1 * n2;
                        break;
                    case 4:
                        result = divide(n1, n2);
                        break;
                    default:
                        throw new IllegalStateException("Opção inesperada: " + option);
                }

                System.out.println("Resultado: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas valores numéricos.");
            } catch (DivisionForZeroException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Operação concluída.");
            }
        }

        scanner.close();
    }
}
