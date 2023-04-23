package ProgrammingBasic.ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= count; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (max < numbers) {
                max = numbers;
            }

            if (min > numbers) {
                min = numbers;
            }
        }

        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d", min);
    }
}