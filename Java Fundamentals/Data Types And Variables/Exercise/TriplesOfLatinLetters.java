package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int end = 97 + number;

        for (int i = 97; i < end; i++) {
            char firstChars = (char) i;

            for (int j = 97; j < end; j++) {
                char secondChars = (char) j;

                for (int k = 97; k < end; k++) {
                    char thirdChars = (char) k;

                    System.out.printf("%c%c%c%n", firstChars, secondChars, thirdChars);
                }
            }
        }
    }
}