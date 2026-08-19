package activities;

import java.util.Scanner;

public class Question10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Informe uma senha forte: ");
            String password = sc.next();

            if (password.length() < 8) {
                System.out.println("A senha precisa conter pelo menos 8 caracteres.");
                continue;
            }

            boolean hasNumber = false;
            boolean hasUpperCase = false;

            for (char character : password.toCharArray()) {
                if (Character.isDigit(character)) {
                    hasNumber = true;
                }

                if (Character.isUpperCase(character)) {
                    hasUpperCase = true;
                }
            }

            if (!hasNumber) {
                System.out.println("A senha precisa conter pelo menos 1 número.");
                continue;
            }

            if (!hasUpperCase) {
                System.out.println("A senha precisa conter pelo menos 1 letra maiúscula.");
                continue;
            }

            System.out.println("Senha válida!");
            break;
        }

        sc.close();
    }
}