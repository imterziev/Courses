package ProgrammingFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counterI = 0;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            int firstSum = 0;
            int secondSum = 0;

            for (int j = i + 1; j < numbers.length; j++) {
                secondSum += numbers[j];
            }

            for (int j = i - 1; j >= 0; j--) {
                firstSum += numbers[j];
            }

            counterI = i;

            if (firstSum == secondSum) {
                isFound = true;
                System.out.println(counterI);
                break;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }
    }
}