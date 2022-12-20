package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double priceNuts = 2;
        double priceWater = 0.7;
        double priceCrisps = 1.5;
        double priceSoda = 0.8;
        double priceCoke = 1;

        double sum = 0;

        while (!input.equals("Start")) {
            double coins = parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            if (!(input.equals("Nuts") || input.equals("Water")
                    || input.equals("Crisps") || input.equals("Soda")
                    || input.equals("Coke"))) {
                System.out.println("Invalid product");
            }

            switch (input) {
                case "Nuts":

                    if (sum >= priceNuts) {
                        sum -= priceNuts;

                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Water":

                    if (sum >= priceWater) {
                        sum -= priceWater;

                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Crisps":

                    if (sum >= priceCrisps) {
                        sum -= priceCrisps;

                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Soda":

                    if (sum >= priceSoda) {
                        sum -= priceSoda;

                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Coke":

                    if (sum >= priceCoke) {
                        sum -= priceCoke;

                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.printf("Change: %.2f", sum);
        }
    }
}