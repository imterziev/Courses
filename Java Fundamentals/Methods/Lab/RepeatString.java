package ProgrammingFundamentals.Methods.Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeats = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatedString(input, repeats));
    }

    private static String repeatedString(String input, int repeats) {
        String repeatedString = "";

        for (int i = 1; i <= repeats; i++) {
            repeatedString += input;
        }

        return repeatedString;
    }
}