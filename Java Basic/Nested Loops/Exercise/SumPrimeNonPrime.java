package ProgrammingBasic.NestedLoops.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int prime = 0;
        int notPrime = 0;

        while (!input.equals("stop")) {
            int currentNumber = Integer.parseInt(input);

            if (currentNumber < 0) {
                System.out.println("Number is negative.");

                input = scanner.nextLine();
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i < currentNumber; i++) {

                if (currentNumber % i == 0) {
                    notPrime += currentNumber;
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                prime += currentNumber;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", prime);
        System.out.printf("Sum of all non prime numbers is: %d", notPrime);
    }
}