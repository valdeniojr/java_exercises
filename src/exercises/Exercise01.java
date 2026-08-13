package exercises;

import java.util.Scanner;

public class Exercise01 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite qual operação deseja fazer (+, -, *, /): ");
        String operation = sc.next();

        switch (operation) {
            case "+" -> System.out.println("O resultado da soma de " + num1 + " + " + num2 + " é " + (num1 + num2));
            case "-" -> System.out.println("O resultado da subtração de " + num1 + " - " + num2 + " é " + (num1 - num2));
            case "*" -> System.out.println("O resultado da multiplicação de " + num1 + " * " + num2 + " é " + (num1 * num2));
            case "/" -> System.out.println("O resultado da divisão de " + num1 + " / " + num2 + " é " + (num1 / num2));
            default -> System.out.println("Operação inválida.");

        }
    }



}
