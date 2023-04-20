package ProgrammingFundamentals.Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.##").format(result(firstNumber, operator, secondNumber)));
    }

    private static double result(double firstNumber, String operator, double secondNumber) {
        double result = 0;

        switch (operator) {
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
        }

        return result;
    }
}