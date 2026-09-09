package activities3.question09;

import java.util.Scanner;

public class App {
    public static void addItem(String name, int amount, double price) {
        if (amount <= 0) {
            throw new InsufficientQuantityException(
                    "A quantidade deve ser maior que zero."
            );
        }

        if (price < 0) {
            throw new InsufficientQuantityException(
                    "O preço não pode ser negativo."
            );
        }

        double total = amount * price;
        System.out.printf(
                "Item adicionado: %s | Quantidade: %d | Preço: R$ %.2f | Total: R$ %.2f%n",
                name,
                amount,
                price,
                total
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do item: ");
        String name = scanner.nextLine();

        System.out.print("Digite a quantidade: ");
        int amount = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o preço: R$ ");
        double price = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        try {
            addItem(name, amount, price);
        } catch (QuantidadeInvalidaException e) {
            System.out.println("Erro na quantidade: " + e.getMessage());
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro no preço: " + e.getMessage());
        }

        scanner.close();
    }
}

