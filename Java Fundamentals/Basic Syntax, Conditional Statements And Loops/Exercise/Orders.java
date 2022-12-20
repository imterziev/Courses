package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());

        double pricePerCapsule = 0;
        int days = 0;
        int capsules = 0;

        double priceOfOrder = 0;
        double totalPrice = 0;

        for (int i = 1; i <= orders; i++) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsules = Integer.parseInt(scanner.nextLine());

            priceOfOrder = days * capsules * pricePerCapsule;

            System.out.printf("The price for the coffee is: $%.2f%n", priceOfOrder);

            totalPrice += priceOfOrder;
        }

        System.out.printf("Total: $%.2f%n", totalPrice);
    }
}