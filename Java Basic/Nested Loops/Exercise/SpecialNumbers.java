package ProgrammingBasic.NestedLoops.Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int i = 1111; i <= 9999; i++) {

            String currentNumber = "" + i;

            for (int j = 0; j < currentNumber.length(); j++) {

                int currentDigit = Integer.parseInt("" + currentNumber.charAt(j));

                if (currentDigit == 0) {

                } else if (number % currentDigit == 0) {
                    count++;
                }
            }

            if (count == 4) {
                System.out.print(currentNumber + " ");
            }

            count = 0;
        }
    }
}