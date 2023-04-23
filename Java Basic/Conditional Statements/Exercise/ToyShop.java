package ProgrammingBasic.ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceHoliday = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totalToys = puzzles + dolls + bears + minions + trucks;
        double price = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);

        if (totalToys >= 50) {
            price = price * 0.75;
        }

        price = price * 0.90;

        double moneyLeft = Math.abs(price - priceHoliday);

        if (priceHoliday <= price) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }
    }
}