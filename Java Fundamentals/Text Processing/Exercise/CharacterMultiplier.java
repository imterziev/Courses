package ProgrammingFundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String first = input[0];
        String second = input[1];

        int sum = 0;
        int smallerLength = 0;
        boolean isFirst = true;

        if (first.length() < second.length()) {
            smallerLength = first.length();
            isFirst = false;
        } else {
            smallerLength = second.length();
        }

        for (int i = 0; i < smallerLength; i++) {
            int charCodeFirst = first.charAt(i);
            int charCodeSecond = second.charAt(i);

            sum += charCodeFirst * charCodeSecond;
        }

        if (isFirst) {
            for (int i = smallerLength; i < first.length(); i++) {
                int charCode = first.charAt(i);
                sum += charCode;
            }
        } else {
            for (int i = smallerLength; i < second.length(); i++) {
                int charCode = second.charAt(i);
                sum += charCode;
            }
        }

        System.out.println(sum);
    }
}