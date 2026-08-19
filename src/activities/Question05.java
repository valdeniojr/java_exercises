package activities;

import java.util.Scanner;

public class Question05 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o usuário: ");
        String username = sc.next();

        System.out.print("Informe a senha: ");
        String password = sc.next();

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login efetuado com sucesso.%n");
        } else {
            System.out.println("Usuário ou senha incorretos.%n");
        }

        sc.close();
    }
}
