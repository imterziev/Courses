package JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(size, scanner);

        int result = result(matrix);

        System.out.println(result);
    }

    private static int result(int[][] matrix) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonalSum += matrix[i][i];
        }

        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            secondaryDiagonalSum += matrix[row][col];

            row++;
            col--;
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    private static int[][] readMatrix(int size, Scanner scanner) {
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        return matrix;
    }
}