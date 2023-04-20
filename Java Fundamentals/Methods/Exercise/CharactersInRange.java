package ProgrammingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        rangeOfCharacters(firstChar, secondChar);
    }

    private static void rangeOfCharacters(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            char temp = secondChar;
            secondChar = firstChar;
            firstChar = temp;
        }

        for (int i = firstChar + 1; i < secondChar; i++) {
            System.out.print((char) i + " ");
        }
    }
}