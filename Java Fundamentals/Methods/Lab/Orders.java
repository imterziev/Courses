package ProgrammingFundamentals.Methods.Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        totalPrice(product, quantity);
    }

    private static void totalPrice(String product, int quantity) {
        double sum = 0;

        switch (product) {
            case "coffee":
                sum = quantity * 1.50;
                break;
            case "water":
                sum = quantity * 1;
                break;
            case "coke":
                sum = quantity * 1.40;
                break;
            case "snacks":
                sum = quantity * 2;
                break;
        }

        System.out.printf("%.2f", sum);
    }
}