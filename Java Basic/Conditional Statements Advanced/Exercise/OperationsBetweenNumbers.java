package ProgrammingBasic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0.00;

        if (number2 == 0) {

            if (operator.equals("%") || operator.equals("/")) {
                System.out.printf("Cannot divide %d by zero", number1);
            }
        } else {

            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = number1 / (number2 * 1.00);
                    break;
                case "%":
                    result = number1 % number2;
                    break;
            }

            switch (operator) {
                case "+":
                case "-":
                case "*":
                    if (result % 2 == 0) {
                        System.out.printf("%d %s %d = %.0f - even", number1, operator, number2, result);
                    } else {
                        System.out.printf("%d %s %d = %.0f - odd", number1, operator, number2, result);
                    }
                    break;
                case "/":
                    System.out.printf("%d / %d = %.2f", number1, number2, result);
                    break;
                case "%":
                    System.out.printf("%d %% %d = %.0f", number1, number2, result);
                    break;
            }
        }
    }
}