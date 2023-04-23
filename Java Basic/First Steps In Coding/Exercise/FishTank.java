package ProgrammingBasic.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double volumeInLiters = volume / 1000;
        double space = volumeInLiters * (percentage / 100.00);
        double liters = volumeInLiters - space;

        System.out.println(liters);
    }
}