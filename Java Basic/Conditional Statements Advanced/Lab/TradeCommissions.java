package ProgrammingBasic.ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        if (sales < 0) {
            System.out.println("error");
        } else {
            if (sales >= 0 && sales <= 500) {
                switch (city) {
                    case "Sofia":
                        commission = sales * 0.05;
                        System.out.printf("%.2f", commission);
                        break;
                    case "Varna":
                        commission = sales * 0.045;
                        System.out.printf("%.2f", commission);
                        break;
                    case "Plovdiv":
                        commission = sales * 0.055;
                        System.out.printf("%.2f", commission);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            } else if (sales <= 1000) {
                switch (city) {
                    case "Sofia":
                        commission = sales * 0.07;
                        System.out.printf("%.2f", commission);
                        break;
                    case "Varna":
                        commission = sales * 0.075;
                        System.out.printf("%.2f", commission);
                        break;
                    case "Plovdiv":
                        commission = sales * 0.08;
                        System.out.printf("%.2f", commission);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            } else if (sales <= 10000) {
                switch (city) {
                    case "Sofia":
                        commission = sales * 0.08;
                        System.out.printf("%.2f", commission);
                        break;
                    case "Varna":
                        commission = sales * 0.10;
                        System.out.printf("%.2f", commission);
                        break;
                    case "Plovdiv":
                        commission = sales * 0.12;
                        System.out.printf("%.2f", commission);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            } else if (sales > 10000) {
                switch (city) {
                    case "Sofia":
                        commission = sales * 0.12;
                        System.out.printf("%.2f", commission);
                        break;
                    case "Varna":
                        commission = sales * 0.13;
                        System.out.printf("%.2f", commission);
                        break;
                    case "Plovdiv":
                        commission = sales * 0.145;
                        System.out.printf("%.2f", commission);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            } else {
                System.out.println("error");
            }
        }
    }
}