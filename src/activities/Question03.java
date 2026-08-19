package activities;

import java.util.Scanner;

public class Question03 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Infome um número: ");
        int n1 = sc.nextInt();

        System.out.print("Infome outro número: ");
        int n2 = sc.nextInt();

        System.out.print("Infome mais um número: ");
        int n3 = sc.nextInt();

        int maior = n1;

        if (n2 > maior) {
            maior = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }

        System.out.printf("O maior número é o %d.%n", maior);

        sc.close();
    }
}
