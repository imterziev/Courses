package JavaAdvanced.WorkshopBasicAlgorithms;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int result = factorial(number);

        System.out.println(result);
    }

    public static int factorial(int number) {
        if (number <= 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}