package ProgrammingBasic.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int litersThinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double addPaint = paint + (paint * 0.10);
        int addnylon = nylon + 2;
        double bag = 0.40;

        double sum = addPaint * 14.50 + addnylon * 1.50 + bag + litersThinner * 5;
        double workSum = hours * (sum * 0.30);
        double finalPrice = sum + workSum;

        System.out.println(finalPrice);
    }
}