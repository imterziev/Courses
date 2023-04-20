package ProgrammingFundamentals.Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(multiplyEvenByOdds(Math.abs(number)));
    }

    private static int multiplyEvenByOdds(int number) {
        return addEven(number) * addOdd(number);
    }

    private static int addEven(int number) {
        int evenNumber = 0;
        int addEven = 0;

        while (number > 0) {
            evenNumber = number % 10;

            if (evenNumber % 2 == 0) {
                addEven += evenNumber;
            }

            number /= 10;
        }

        return addEven;
    }

    private static int addOdd(int number) {
        int oddNumber = 0;
        int addOdd = 0;

        while (number > 0) {
            oddNumber = number % 10;

            if (oddNumber % 2 != 0) {
                addOdd += oddNumber;
            }

            number /= 10;
        }

        return addOdd;
    }
}