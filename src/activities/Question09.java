package activities;

import java.util.Scanner;

public class Question09 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int option;
        int animalCount = 0;
        double greaterWeight = 0;
        double lowerWeight = 0;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cadastrar Peso");
            System.out.println("2. Finalizar");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();

            switch (option) {
                case 1: {
                    System.out.print("Informe o peso do animal: ");
                    double weight = sc.nextDouble();

                    animalCount++;

                    if (animalCount == 1) {
                        greaterWeight = weight;
                        lowerWeight = weight;
                    } else {
                        if (weight > greaterWeight) {
                            greaterWeight = weight;
                        }

                        if (weight < lowerWeight) {
                            lowerWeight = weight;
                        }
                    }

                    System.out.println("Peso cadastrado com sucesso.");
                    break;
                }

                case 2: {
                    System.out.println("\n=== ESTATÍSTICAS ===");

                    if (animalCount > 0) {
                        System.out.printf("Animais registrados: %d.%n", animalCount);
                        System.out.printf("Maior peso: %.1f.%n", greaterWeight);
                        System.out.printf("Menor peso: %.1f.%n", lowerWeight);
                    } else {
                        System.out.println("Nenhum animal foi cadastrado.");
                    }

                    System.out.println("Sistema encerrado.");
                    break;

                }

                default: {
                    System.out.println("Opção inválida.");
                }

            }
        } while (option != 2);

        sc.close();

    }
}
