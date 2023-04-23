package ProgrammingBasic.ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {

            int numbers = Integer.parseInt(scanner.nextLine());
            sum1 += numbers;
        }

        for (int i = 0; i < n; i++) {

            int numbers = Integer.parseInt(scanner.nextLine());
            sum2 += numbers;
        }

        totalSum = Math.abs(sum1 - sum2);

        if (totalSum == 0) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", totalSum);
        }
    }
}