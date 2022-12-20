package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result = number * i;

            System.out.printf("%d X %d = %d%n", number, i, result);
        }
    }
}