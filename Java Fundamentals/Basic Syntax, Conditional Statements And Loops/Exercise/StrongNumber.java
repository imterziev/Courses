package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        int fact = 1;
        int num = 0;
        int sum = 0;

        for (int y = 0; y <= number.length() - 1; y++) {
            num = parseInt(String.valueOf(number.charAt(y)));

            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            sum += fact;
            fact = 1;
        }

        if (number.equals(String.valueOf(sum))) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}