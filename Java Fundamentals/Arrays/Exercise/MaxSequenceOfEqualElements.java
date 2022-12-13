package ProgrammingFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        int[] numbers = Arrays.stream(new Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counter = 1;
        int biggestCount = Integer.MIN_VALUE;
        int element = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                counter++;

                if (biggestCount < counter) {
                    biggestCount = counter;
                    element = numbers[i];
                }
            } else {
                counter = 1;
            }
        }

        for (int i = 1; i <= biggestCount; i++) {
            System.out.print(element + " ");
        }
    }
}