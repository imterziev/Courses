package ProgrammingFundamentals.Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int raised = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(getNumber(number, raised)));
    }

    private static double getNumber(double number, int raised) {
        return Math.pow(number, raised);
    }
}