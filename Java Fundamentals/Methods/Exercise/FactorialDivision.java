package ProgrammingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", factorialDivision(firstNumber, secondNumber));
    }

    private static double factorialDivision(int firstNumber, int secondNumber) {
        double firstFactorial = 1;
        double secondFactorial = 1;

        if (firstNumber <= 0) {
            firstFactorial = 1;
        } else {
            for (int i = 1; i <= firstNumber; i++) {
                firstFactorial *= i;
            }
        }

        if (secondNumber <= 0) {
            secondFactorial = 1;
        } else {
            for (int i = 1; i <= secondNumber; i++) {
                secondFactorial *= i;
            }
        }

        return firstFactorial / secondFactorial;
    }
}