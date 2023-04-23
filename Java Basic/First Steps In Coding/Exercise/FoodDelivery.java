package ProgrammingBasic.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegeterian = Integer.parseInt(scanner.nextLine());

        double price = chicken * 10.35 + fish * 12.40 + vegeterian * 8.15;
        double dessert = price * 0.20;

        double finalPrice = price + dessert + 2.50;

        System.out.println(finalPrice);
    }
}