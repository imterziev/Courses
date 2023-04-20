package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        String splitPattern = ", ";

        int[][] matrix = readMatrix(rows, cols, scanner, splitPattern);

        int totalSum = 0;

        for (int row = 0; row < rows; row++) {
            totalSum += Arrays.stream(matrix[row]).sum();
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(totalSum);
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner, String splitPattern) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern))
                    .mapToInt(Integer::parseInt).toArray();
        }

        return matrix;
    }
}