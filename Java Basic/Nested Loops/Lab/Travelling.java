package ProgrammingBasic.NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        double savedMoney = 0;
        String moneyAdd = "";

        while (!destination.equals("End")) {

            String moneyString = scanner.nextLine();

            if (moneyString.equals("End")) {
                break;
            }

            double needMoney = Double.parseDouble(moneyString);

            while (savedMoney < needMoney) {
                moneyAdd = scanner.nextLine();

                if (moneyAdd.equals("End")) {
                    break;
                }

                double money = Double.parseDouble(moneyAdd);
                savedMoney += money;
            }

            if (moneyString.equals("End") || moneyAdd.equals("End")) {
                break;
            } else {
                System.out.printf("Going to %s!%n", destination);
            }

            savedMoney = 0;

            destination = scanner.nextLine();
        }
    }
}