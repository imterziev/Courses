package ProgrammingFundamentals.FinalExam;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] commands = input.split(" ");
            String command = commands[0];

            switch (command) {
                case "TakeOdd":
                    password = getOddPassword(password);
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commands[1]);
                    int length = Integer.parseInt(commands[2]);
                    String substringToRemove = password.substring(index, index + length);
                    password = password.replaceFirst(substringToRemove, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = commands[1];
                    String substitute = commands[2];

                    if (password.contains(substring)) {
                        password = password.replace(substring, substitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", password);
    }

    private static String getOddPassword(String password) {
        StringBuilder newPassword = new StringBuilder();

        for (int i = 1; i < password.length(); i += 2) {
            char currentChar = password.charAt(i);
            newPassword.append(currentChar);
        }

        return newPassword.toString();
    }
}