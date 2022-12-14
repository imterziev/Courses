package ProgrammingFundamentals.Arrays.Lab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersArray = scanner.nextLine().split(" ");
        int[] number = new int[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++) {
            number[i] = Integer.parseInt(numbersArray[i]);
        }

        int sum = 0;

        for (int currentNumber : number) {
            if (currentNumber % 2 == 0) {
                sum += currentNumber;
            }
        }

        System.out.println(sum);
    }
}