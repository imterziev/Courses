package ProgrammingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        getTopIntegers(number);
    }

    private static void getTopIntegers(int number) {
        for (int i = 1; i <= number; i++) {
            int getIndex = i;
            int secondNumber = 0;
            int thirdNumber = 0;
            boolean isDivisible = false;
            boolean isOddDigit = false;

            while (getIndex > 0) {
                secondNumber = getIndex % 10;
                thirdNumber += secondNumber;

                if (secondNumber % 2 != 0) {
                    isOddDigit = true;
                }

                getIndex /= 10;
            }

            if (thirdNumber % 8 == 0) {
                isDivisible = true;
            }

            if (isDivisible && isOddDigit) {
                System.out.println(i);
            }
        }
    }
}