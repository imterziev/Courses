package ProgrammingBasic.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double cent = a * 2.54;
        System.out.println(cent);
    }
}