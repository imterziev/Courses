package ProgrammingBasic.WhileLoop.Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String pass = scanner.nextLine();

        while (!pass.equals(password)) {
            pass = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", username);
    }
}