package activities;

import java.util.Scanner;

public class Question08 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quanto você ganha por hora: ");
        double salaryPerHour = sc.nextDouble();

        System.out.print("Informe quantas horas você trabalha por mês: ");
        double hoursWorked = sc.nextDouble();

        double totalSalary = (salaryPerHour * hoursWorked);
        double deductionIR = (totalSalary * 0.11);
        double deductionINSS = (totalSalary * 0.8);
        double deductionUnion = (totalSalary * 0.05);

        double totalDeductions = (deductionUnion + deductionINSS + deductionIR);

        double netSalary = (totalSalary - totalDeductions);

        System.out.printf("Salário Bruto: R$%.2f.%n", totalSalary);
        System.out.printf("IR: R$%.2f.%n", deductionIR);
        System.out.printf("INSS: R$%.2f.%n", deductionINSS);
        System.out.printf("Sindicato: R$%.2f.%n", deductionUnion);
        System.out.printf("Salário Liquído: R$%.2f.%n", netSalary);

        sc.close();

    }
}
