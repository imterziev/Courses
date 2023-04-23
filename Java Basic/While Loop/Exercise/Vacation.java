package ProgrammingBasic.WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tripMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int days = 0;
        int spendDays = 0;
        double totalMoney = money;

        while (spendDays < 5) {
            String saveSpend = scanner.nextLine();
            double moneyForDay = Double.parseDouble(scanner.nextLine());

            if (saveSpend.equals("spend")) {
                spendDays++;
                totalMoney -= moneyForDay;

                if (totalMoney <= 0) {
                    totalMoney = 0;
                }
            } else if (saveSpend.equals("save")) {
                spendDays = 0;
                totalMoney += moneyForDay;
            }

            days++;

            if (totalMoney >= tripMoney) {
                break;
            }
        }

        if (spendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else if (totalMoney >= tripMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}