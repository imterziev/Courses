package ProgrammingFundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (String sequence : input) {
            char firstLetter = sequence.charAt(0);
            double currentSum = Double.parseDouble(sequence.substring(1, sequence.length() - 1));

            if (Character.isUpperCase(firstLetter)) {
                currentSum /= firstLetter - 64;
            } else {
                currentSum *= firstLetter - 96;
            }

            char lastLetter = sequence.charAt(sequence.length() - 1);

            if (Character.isUpperCase(lastLetter)) {
                currentSum -= lastLetter - 64;
            } else {
                currentSum += lastLetter - 96;
            }

            totalSum += currentSum;
        }

        System.out.printf("%.2f", totalSum);
    }
}