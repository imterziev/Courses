package ProgrammingFundamentals.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numbers; i++) {

            int digits = i;
            int sum = 0;


            while (digits > 0) {
                int num = 0;
                num = digits % 10;
                sum = sum + num;
                digits = digits / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }
        }
    }
}