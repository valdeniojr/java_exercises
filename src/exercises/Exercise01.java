package exercises;

import java.util.Scanner;

public class Exercise01 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número");
        int num2 = sc.nextInt();

        System.out.print("Digite qual operação deseja fazer (+, -, *, /): ");
        String operation = sc.next();

        switch (operation) {
            case "+" -> System.out.println("O resultado da soma de 1 + 1 é 2");
        }
    }



}
