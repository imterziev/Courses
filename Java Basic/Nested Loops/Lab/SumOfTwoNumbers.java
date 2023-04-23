package ProgrammingBasic.NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isFound = false;

        for (int i = start; i <= stop; i++) {

            for (int j = start; j <= stop; j++) {

                counter++;

                if (i + j == number) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, number);
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                break;
            }
        }

        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, number);
        }
    }
}