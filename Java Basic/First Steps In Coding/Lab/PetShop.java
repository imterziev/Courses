package ProgrammingBasic.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Integer.parseInt(scanner.nextLine());
        double b = Integer.parseInt(scanner.nextLine());
        double dogFood = a * 2.50;
        double catFood = b * 4;

        System.out.println(dogFood + catFood + " lv.");
    }
}