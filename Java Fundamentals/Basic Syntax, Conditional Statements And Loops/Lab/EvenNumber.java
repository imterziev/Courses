package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isEven = false;

        while (!isEven) {
            if (number % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(number));

                isEven = true;
            } else {
                System.out.println("Please write an even number.");

                number = Integer.parseInt(scanner.nextLine());
            }
        }
    }
}