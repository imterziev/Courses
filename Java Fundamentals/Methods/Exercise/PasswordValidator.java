package ProgrammingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (checkPassword(password)) {
            System.out.println("Password is valid");
        }
    }

    private static boolean checkPassword(String password) {
        boolean isValid = true;

        if (!(checkLength(password))) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        if (!(checkLettersAndDigits(password))) {
            isValid = false;
        }

        if (!(checkOnlyDigits(password))) {
            isValid = false;
        }

        return isValid;
    }

    private static boolean checkLength(String password) {
        return password.length() > 5 && password.length() < 11;
    }

    private static boolean checkLettersAndDigits(String password) {
        boolean isValid = true;

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);

            if (!Character.isLetterOrDigit(currentChar)) {
                System.out.println("Password must consist only of letters and digits");
                isValid = false;
                break;
            }
        }

        return isValid;
    }

    private static boolean checkOnlyDigits(String password) {
        int counter = 0;
        char currentChar = 0;
        boolean isValid = true;

        for (int i = 0; i < password.length(); i++) {
            currentChar = password.charAt(i);

            if (Character.isDigit(currentChar)) {
                counter++;
            }

            if (counter == 2) {
                break;
            }
        }

        if (counter < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        return isValid;
    }
}