package ProgrammingBasic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double totalPrice = budget;
        String hotelOrCamp = "";
        String destination = "";

        if (season.equals("summer")) {
            hotelOrCamp = "Camp";

            if (budget <= 100) {
                totalPrice = totalPrice * 0.30;
                destination = "Bulgaria";
            } else if (budget <= 1000) {
                totalPrice = totalPrice * 0.40;
                destination = "Balkans";
            } else if (budget > 1000) {
                totalPrice = totalPrice * 0.90;
                destination = "Europe";
                hotelOrCamp = "Hotel";
            }
        } else {
            hotelOrCamp = "Hotel";

            if (budget <= 100) {
                totalPrice = totalPrice * 0.70;
                destination = "Bulgaria";
            } else if (budget <= 1000) {
                totalPrice = totalPrice * 0.80;
                destination = "Balkans";
            } else if (budget > 1000) {
                totalPrice = totalPrice * 0.90;
                destination = "Europe";
            }
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", hotelOrCamp, totalPrice);
    }
}