package ProgrammingBasic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String mark = scanner.nextLine();

        double roomForOne = 18;
        double apartment = 25;
        double president = 35;

        int nights = days - 1;
        double totalPrice = 0;

        switch (room) {
            case "room for one person":
                totalPrice = nights * roomForOne;
                break;
            case "apartment":
                if (days < 10) {
                    totalPrice = (nights * apartment) * 0.70;
                } else if (days <= 15) {
                    totalPrice = (nights * apartment) * 0.65;
                } else {
                    totalPrice = (nights * apartment) * 0.50;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    totalPrice = (nights * president) * 0.90;
                } else if (days <= 15) {
                    totalPrice = (nights * president) * 0.85;
                } else {
                    totalPrice = (nights * president) * 0.80;
                }
                break;
        }

        if (mark.equals("positive")) {
            totalPrice = totalPrice + (totalPrice * 0.25);
        } else if (mark.equals("negative")) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        }

        System.out.printf("%.2f", totalPrice);
    }
}