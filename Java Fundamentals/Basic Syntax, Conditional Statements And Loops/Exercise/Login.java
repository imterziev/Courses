package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";
        int counter = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        String pass = scanner.nextLine();

        while (!pass.equals(password)) {
            counter++;

            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
                pass = scanner.nextLine();
            }
        }

        if (pass.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}