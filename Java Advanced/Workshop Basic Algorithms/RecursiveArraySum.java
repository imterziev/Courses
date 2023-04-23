package JavaAdvanced.WorkshopBasicAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int sum = calculateSum(arr, 0);

        System.out.println(sum);
    }

    public static int calculateSum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[arr.length - 1];
        }

        return arr[index] + calculateSum(arr, index + 1);
    }
}