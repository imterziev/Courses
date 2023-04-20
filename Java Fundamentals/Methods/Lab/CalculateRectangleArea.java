package ProgrammingFundamentals.Methods.Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width = Integer.parseInt(scanner.nextLine());
        double length = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", areaOfRectangle(width, length));
    }

    private static double areaOfRectangle(double width, double length) {
        return width * length;
    }
}