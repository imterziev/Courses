package ProgrammingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(getMiddleCharacter(input));
    }

    private static String getMiddleCharacter(String input) {
        char middle = ' ';
        char secondMiddle = ' ';

        if (input.length() % 2 != 0) {
            middle = input.charAt(input.length() / 2);
        } else {
            middle = input.charAt(input.length() / 2);
            secondMiddle = input.charAt(input.length() / 2 - 1);
        }

        String middleCharacters = String.valueOf(secondMiddle) + String.valueOf(middle);

        return middleCharacters;
    }
}