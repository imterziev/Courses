package ProgrammingBasic.ConditionalStatements.Lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        if (pass.equals("s3cr3t!P@ssw0rd")) {
            System.out.printf("Welcome");
        } else {
            System.out.printf("Wrong password!");
        }
    }
}