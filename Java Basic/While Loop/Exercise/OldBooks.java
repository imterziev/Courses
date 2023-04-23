package ProgrammingBasic.WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameOfBook = scanner.nextLine();

        String book = scanner.nextLine();
        int counterBooks = 0;
        boolean isFound = false;

        while (!book.equals("No More Books")) {

            if (book.equals(nameOfBook)) {
                isFound = true;
                break;
            }

            counterBooks++;

            book = scanner.nextLine();
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", counterBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counterBooks);
        }
    }
}