package ProgrammingBasic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (type) {
            case "Roses":
                totalPrice = number * 5;

                if (number > 80) {
                    totalPrice = totalPrice * 0.90;
                }
                break;
            case "Dahlias":
                totalPrice = number * 3.80;

                if (number > 90) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Tulips":
                totalPrice = number * 2.80;

                if (number > 80) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Narcissus":
                totalPrice = number * 3;

                if (number < 120) {
                    totalPrice += totalPrice * 0.15;
                }
                break;
            case "Gladiolus":
                totalPrice = number * 2.50;

                if (number < 80) {
                    totalPrice += totalPrice * 0.20;
                }
                break;
        }

        double moneyLeft = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, type, moneyLeft);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", moneyLeft);
        }
    }
}