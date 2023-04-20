package ProgrammingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(getPalindrome(input));

            input = scanner.nextLine();
        }
    }

    private static boolean getPalindrome(String input) {
        String thirdNumber = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            thirdNumber += input.charAt(i);
        }

        if (thirdNumber.equals(input)) {
            return true;
        } else {
            return false;
        }
    }
}