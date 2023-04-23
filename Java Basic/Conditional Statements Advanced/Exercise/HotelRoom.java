package ProgrammingBasic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceApartment = 0;
        double priceStudio = 0;

        if (month.equals("May") || month.equals("October")) {
            priceApartment = nights * 65;
            priceStudio = nights * 50;

            if (nights > 7 && nights <= 14) {
                priceStudio = priceStudio * 0.95;
            } else if (nights > 14) {
                priceStudio = priceStudio * 0.70;
                priceApartment = priceApartment * 0.90;
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceApartment = nights * 68.70;
            priceStudio = nights * 75.20;

            if (nights > 14) {
                priceStudio = priceStudio * 0.80;
                priceApartment = priceApartment * 0.90;
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceApartment = nights * 77;
            priceStudio = nights * 76;

            if (nights > 14) {
                priceApartment = priceApartment * 0.90;
            }
        }

        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}