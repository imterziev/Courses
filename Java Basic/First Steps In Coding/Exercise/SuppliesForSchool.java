package ProgrammingBasic.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersPens = Integer.parseInt(scanner.nextLine());
        int numbersMarkers = Integer.parseInt(scanner.nextLine());
        int litersPreparation = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double sum = numbersPens * 5.80 + numbersMarkers * 7.20 + litersPreparation * 1.20;
        double sumAfterDiscount = sum - (sum * discount / 100);

        System.out.println(sumAfterDiscount);
    }
}