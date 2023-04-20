package ProgrammingFundamentals.MidExam;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double quantityFood = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityHay = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityCover = Double.parseDouble(scanner.nextLine()) * 1000;
        double startingWeight = Double.parseDouble(scanner.nextLine()) * 1000;

        int days = 1;
        boolean isOver = false;

        while (days <= 30) {
            quantityFood -= 300;

            if (days % 2 == 0) {
                double hayForDay = quantityFood * 0.05;
                quantityHay -= hayForDay;
            }

            if (days % 3 == 0) {
                quantityCover -= startingWeight / 3;
            }

            if (quantityFood <= 0 || quantityCover <= 0 || quantityHay <= 0) {
                isOver = true;
                break;
            }

            days++;
        }

        if (isOver) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! JavaOOP.Inheritance.Exercise.Restaurant.Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFood / 1000, quantityHay / 1000, quantityCover / 1000);
        }
    }
}