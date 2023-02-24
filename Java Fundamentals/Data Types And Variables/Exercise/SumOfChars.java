package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= lines; i++) {
            char chars = scanner.nextLine().charAt(0);
            sum += chars;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}