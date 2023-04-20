package ProgrammingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        getMin(firstNumber, secondNumber, thirdNumber);
    }

    private static void getMin(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.println(Math.min(firstNumber, Math.min(secondNumber, thirdNumber)));
    }
}