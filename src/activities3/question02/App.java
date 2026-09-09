package activities3.question02;

import java.util.Scanner;

public class App {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};

        System.out.printf("Digite a posição desejada (0 a %d): ", names.length - 1);
        int position = scanner.nextInt();

        try {
            System.out.println("Nome encontrado: " + names[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf(
                    "Posição inválida! O vetor só possui %d posições (0 a %d).%n",
                    names.length,
                    names.length - 1
            );
        }

        scanner.close();
    }
}
