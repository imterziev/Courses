package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                result += i;
                number++;
            }
        }

        System.out.printf("Sum: %d", result);
    }
}