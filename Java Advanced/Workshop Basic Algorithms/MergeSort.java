package JavaAdvanced.WorkshopBasicAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        mergeSort(arr);

        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }

    private static void mergeSort(int[] arr) {
        int length = arr.length;

        if (length < 2) {
            return;
        }

        int midIndex = length / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length - midIndex];

        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = arr[i];
        }

        for (int i = midIndex; i < arr.length; i++) {
            rightHalf[i - midIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }

            k++;
        }

        while (i < leftSize) {
            arr[k] = leftHalf[i];
            k++;
            i++;
        }

        while (j < rightSize) {
            arr[k] = rightHalf[j];
            k++;
            j++;
        }
    }
}