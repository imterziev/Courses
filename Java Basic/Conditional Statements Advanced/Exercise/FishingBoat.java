package ProgrammingBasic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (season) {
            case "Spring":
                totalPrice = 3000;
                if (fisherman <= 6) {
                    totalPrice = totalPrice * 0.90;
                } else if (fisherman <= 11) {
                    totalPrice = totalPrice * 0.85;
                } else {
                    totalPrice = totalPrice * 0.75;
                }
                break;
            case "Summer":
            case "Autumn":
                totalPrice = 4200;
                if (fisherman <= 6) {
                    totalPrice = totalPrice * 0.90;
                } else if (fisherman <= 11) {
                    totalPrice = totalPrice * 0.85;
                } else {
                    totalPrice = totalPrice * 0.75;
                }
                break;
            case "Winter":
                totalPrice = 2600;
                if (fisherman <= 6) {
                    totalPrice = totalPrice * 0.90;
                } else if (fisherman <= 11) {
                    totalPrice = totalPrice * 0.85;
                } else {
                    totalPrice = totalPrice * 0.75;
                }
                break;
        }

        if (fisherman % 2 == 0) {
            if (!season.equals("Autumn")) {
                totalPrice = totalPrice * 0.95;
            }
        }

        double moneyLeft = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyLeft);
        }
    }
}