package ProgrammingFundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            if (!(username.length() >= 3 && username.length() <= 16)) {
                continue;
            }

            boolean isValid = true;

            for (int i = 0; i < username.length(); i++) {
                char currentChar = username.charAt(i);

                if (!(Character.isLetterOrDigit(currentChar) || currentChar == '-' || currentChar == '_')) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.println(username);
            }
        }
    }
}