package activities;

import java.util.Scanner;

public class Question07 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número que deseja a tabuada: ");
        int number = sc.nextInt();

        System.out.printf("Tabuada do %d %n", number);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", i, number, (i * number));
        }

        sc.close();
    }
}
