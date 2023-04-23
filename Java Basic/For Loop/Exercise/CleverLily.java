package ProgrammingBasic.ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double priceMachine = Double.parseDouble(scanner.nextLine());
        int priceToys = Integer.parseInt(scanner.nextLine());

        double moneyGift = 0;
        int toys = 0;
        int moneyTaken = 0;
        int toysMoney = 0;

        for (int i = 1; i <= years; i++) {

            if (i % 2 == 0) {
                moneyGift += 10.00 * i / 2;
                moneyTaken++;
            } else {
                toys++;
            }
        }

        toysMoney = priceToys * toys;
        moneyGift = moneyGift - moneyTaken + toysMoney;

        double moneyDifference = Math.abs(moneyGift - priceMachine);

        if (moneyGift >= priceMachine) {
            System.out.printf("Yes! %.2f", moneyDifference);
        } else {
            System.out.printf("No! %.2f", moneyDifference);
        }
    }
}