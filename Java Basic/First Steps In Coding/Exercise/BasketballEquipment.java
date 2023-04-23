package ProgrammingBasic.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taxPerYear = Integer.parseInt(scanner.nextLine());

        double shoes = taxPerYear - taxPerYear * 0.40;
        double outfit = shoes - shoes * 0.20;
        double ball = outfit / 4;
        double accessories = ball / 5;

        double sum = taxPerYear + shoes + outfit + ball + accessories;

        System.out.println(sum);
    }
}