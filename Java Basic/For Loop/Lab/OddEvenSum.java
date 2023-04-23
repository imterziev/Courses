package ProgrammingBasic.ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {

            int numbers = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sum1 += numbers;
            } else {
                sum2 += numbers;
            }
        }

        totalSum = Math.abs(sum1 - sum2);

        if (totalSum == 0) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum1);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", totalSum);
        }
    }
}