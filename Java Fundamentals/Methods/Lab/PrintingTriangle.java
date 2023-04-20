package ProgrammingFundamentals.Methods.Lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sizeOfTriangle = Integer.parseInt(scanner.nextLine());

        printTriangle(sizeOfTriangle);
    }

    private static void printTriangle(int sizeOfTriangle) {
        upSideOfTriangle(sizeOfTriangle);
        downSideOfTriangle(sizeOfTriangle);
    }

    private static void upSideOfTriangle(int sizeOfTriangle) {
        for (int i = 1; i < sizeOfTriangle; i++) {
            printLines(i);
        }
    }

    private static void printLines(int lengthOfLine) {
        for (int i = 1; i <= lengthOfLine; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    private static void downSideOfTriangle(int sizeOfTriangle) {
        for (int i = sizeOfTriangle; i >= 1; i--) {
            printLines(i);
        }
    }
}