package activities3.question07;

import java.util.Scanner;

public class App {
    public static void registerAge(int age) throws AgeInvalidException {
        if (age < 0 || age > 120) {
            throw new AgeInvalidException(
                    "Idade inválida! Informe um valor entre 0 e 120 anos."
            );
        }

        System.out.println("Idade cadastrada com sucesso: " + age + " anos.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int age = scanner.nextInt();

        try {
            registerAge(age);
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

