package ProgrammingBasic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        int seats = rows * columns;

        switch (type) {
            case "Premiere":
                totalPrice = seats * 12;
                break;
            case "Normal":
                totalPrice = seats * 7.50;
                break;
            case "Discount":
                totalPrice = seats * 5;
                break;
        }

        System.out.printf("%.2f leva", totalPrice);
    }
}