package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double discount = 0;
        double totalPrice = 0;

        if (day.equals("Friday")) {
            if (typeOfGroup.equals("Students")) {
                totalPrice = people * 8.45;

                if (people >= 30) {
                    discount = totalPrice * 0.15;
                    totalPrice -= discount;
                }
            } else if (typeOfGroup.equals("Business")) {
                totalPrice = people * 10.90;

                if (people >= 100) {
                    discount = 10.90 * 10;
                    totalPrice -= discount;
                }
            } else if (typeOfGroup.equals("Regular")) {
                totalPrice = people * 15;

                if (people >= 10 && people <= 20) {
                    discount = totalPrice * 0.05;
                    totalPrice -= discount;
                }
            }
        } else if (day.equals("Saturday")) {
            if (typeOfGroup.equals("Students")) {
                totalPrice = people * 9.80;

                if (people >= 30) {
                    discount = totalPrice * 0.15;
                    totalPrice -= discount;
                }
            } else if (typeOfGroup.equals("Business")) {
                totalPrice = people * 15.60;

                if (people >= 100) {
                    discount = 15.60 * 10;
                    totalPrice -= discount;
                }
            } else if (typeOfGroup.equals("Regular")) {
                totalPrice = people * 20;

                if (people >= 10 && people <= 20) {
                    discount = totalPrice * 0.05;
                    totalPrice -= discount;
                }
            }
        } else if (day.equals("Sunday")) {
            if (typeOfGroup.equals("Students")) {
                totalPrice = people * 10.46;

                if (people >= 30) {
                    discount = totalPrice * 0.15;
                    totalPrice -= discount;
                }
            } else if (typeOfGroup.equals("Business")) {
                totalPrice = people * 16;

                if (people >= 100) {
                    discount = 16 * 10;
                    totalPrice -= discount;
                }
            } else if (typeOfGroup.equals("Regular")) {
                totalPrice = people * 22.50;

                if (people >= 10 && people <= 20) {
                    discount = totalPrice * 0.05;
                    totalPrice -= discount;
                }
            }
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}