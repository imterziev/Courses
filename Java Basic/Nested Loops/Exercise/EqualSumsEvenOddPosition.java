package ProgrammingBasic.NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= stop; i++) {

            String currentNumber = "" + i;

            int sumOdd = 0;
            int sumEven = 0;

            for (int j = 0; j < currentNumber.length(); j++) {

                int currentDigit = Integer.parseInt("" + currentNumber.charAt(j));

                if (j % 2 == 0) {
                    sumEven += currentDigit;
                } else {
                    sumOdd += currentDigit;
                }
            }

            if (sumOdd == sumEven) {
                System.out.print(i + " ");
            }
        }
    }
}