package ProgrammingFundamentals.Arrays.Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int[] numbersArray = new int[numbers];

        for (int i = 0; i <= numbersArray.length - 1; i++) {
            numbersArray[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numbersArray.length - 1; i >= 0; i--) {
            System.out.print(numbersArray[i] + " ");
        }
    }
}