package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int result = 0;

        if (secondNumber > 10) {
            result = firstNumber * secondNumber;

            System.out.printf("%d X %d = %d%n", firstNumber, secondNumber, result);
        } else {
            for (int i = secondNumber; i <= 10; i++) {
                result = firstNumber * i;

                System.out.printf("%d X %d = %d%n", firstNumber, i, result);
            }
        }
    }
}