package ProgrammingFundamentals.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numbers; i++) {

            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            boolean isSpecialNum = (sum == 5 || sum == 7 || sum == 11);

            if (isSpecialNum) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}