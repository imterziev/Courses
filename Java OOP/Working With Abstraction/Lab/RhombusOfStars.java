package JavaOOP.WorkingWithAbstraction.Lab;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printFigure(input);
    }

    private static void printFigure(int input) {
        printTop(input);
        printMid(input);
        printBottom(input);
    }

    public static void repeatAndPrintString(int count, String string) {
        for (int i = 0; i < count; i++) {
            System.out.print(string);
        }
    }

    public static void printTop(int input) {
        for (int i = 1; i < input; i++) {
            repeatAndPrintString(input - i, " ");
            repeatAndPrintString(i, "* ");

            System.out.println();
        }
    }

    public static void printMid(int input) {
        repeatAndPrintString(input, "* ");

        System.out.println();
    }

    public static void printBottom(int input) {
        for (int i = 1; i < input; i++) {
            repeatAndPrintString(i, " ");
            repeatAndPrintString(input - i, "* ");

            System.out.println();
        }
    }
}