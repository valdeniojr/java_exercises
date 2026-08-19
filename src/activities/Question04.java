package activities;

import java.util.Scanner;

public class Question04 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        double height = sc.nextDouble();

        System.out.print("Informe seu peso: ");
        double weight = sc.nextDouble();

        double imc = weight / Math.pow(height, 2);

        if (imc >= 30) {
            System.out.printf("Seu IMC é %.1f, Classificação: Obeso.%n", imc);
        } else if (imc >= 25) {
            System.out.printf("Seu IMC é %.1f, Classificação: Sobrepeso.%n", imc);
        } else if (imc >= 18.5) {
            System.out.printf("Seu IMC é %.1f, Classificação: Peso normal.%n", imc);
        } else {
            System.out.printf("Seu IMC é %.1f, Classificação: Abaixo do peso.%n", imc);
        }

        sc.close();
    }
}