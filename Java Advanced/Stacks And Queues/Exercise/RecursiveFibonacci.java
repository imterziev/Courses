package JavaAdvanced.StacksAndQueues.Exercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        System.out.println(getFibonacci(input));
    }

    private static int getFibonacci(int input) {
        if (input <= 1) {
            return 1;
        }

        return getFibonacci(input - 1) + getFibonacci(input - 2);
    }
}