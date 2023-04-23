package JavaOOP.WorkingWithAbstraction.Lab.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        String season = input[2].toUpperCase();
        String discountType = input[3];

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, numberOfDays, Seasons.valueOf(season), DiscountType.fromString(discountType));

        System.out.println(priceCalculator);
    }
}