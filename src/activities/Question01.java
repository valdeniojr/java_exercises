package activities;

import java.util.Scanner;

public class Question01 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String name = sc.next();

        System.out.print("Informe sua idade: ");
        int age = sc.nextInt();

        System.out.printf("Olá, %s! Você tem %d anos", name, age);
        System.out.println("");

        sc.close();
    }

}
