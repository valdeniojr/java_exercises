package activities;

import java.util.Scanner;

public class Question06 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo de combustível [G - Gasolina | A - Álcool]: ");
        String fuelType = sc.next().toUpperCase();

        System.out.print("Informe a quantidade de litros que deseja abastecer: ");
        double liters = sc.nextDouble();

        double gasolinePricePerLiter = 5;
        double alcoholPricePerLiter = 4;

        if (fuelType.equals("G")) {
            double priceTotal = (gasolinePricePerLiter * liters);
            System.out.printf("Abastecimento Gasolina: %.2f L | Total a pagar: R$ %.2f%n", liters, priceTotal);
        } else {
            double priceTotal = (alcoholPricePerLiter * liters);
            System.out.printf("Abastecimento Álcool: %.2f L | Total a pagar: R$ %.2f%n", liters, priceTotal);
        }

        sc.close();
    }
}
