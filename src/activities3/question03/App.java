package activities3.question03;

import java.util.Scanner;

public class App {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        String ageText = scanner.nextLine();

        try {
            int age = Integer.parseInt(ageText);
            System.out.println("Idade informada: " + age + " anos.");
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite apenas números.");
        }

        scanner.close();
    }
}
