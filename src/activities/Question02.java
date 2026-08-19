package activities;

import java.util.Scanner;

public class Question02 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.printf("O número %d é par.%n", number);
        } else {
            System.out.printf("O número %d é ímpar.%n", number);
        }

        sc.close();
    }

}
