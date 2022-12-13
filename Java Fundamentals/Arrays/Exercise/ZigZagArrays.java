package ProgrammingFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (i % 2 == 0) {
                firstArray[i] = numbers[0];
                secondArray[i] = numbers[1];
            } else {
                firstArray[i] = numbers[1];
                secondArray[i] = numbers[0];
            }

            System.out.print(firstArray[i] + " ");
        }

        System.out.println();

        for (int secondRow : secondArray) {
            System.out.print(secondRow + " ");
        }
    }
}