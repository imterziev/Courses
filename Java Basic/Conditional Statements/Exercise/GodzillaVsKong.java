package ProgrammingBasic.ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double cloths = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double priceCloths = extras * cloths;

        if (extras > 150) {
            priceCloths = priceCloths * 0.90;
        }

        double totalPrice = decor + priceCloths;
        double moneyLeft = Math.abs(budget - totalPrice);

        if (budget < totalPrice) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", moneyLeft);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", moneyLeft);
        }
    }
}