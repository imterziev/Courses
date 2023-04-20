package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String splitPattern = ", ";

        int rows = Integer.parseInt(scanner.nextLine().split(splitPattern)[0]);

        int[][] matrix = readMatrix(rows, scanner, splitPattern);

        int maxSum = Integer.MIN_VALUE;
        int[][] maxMatrix = new int[2][2];

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int current = matrix[row][col];
                int bottom = matrix[row + 1][col];
                int right = matrix[row][col + 1];
                int rightBottom = matrix[row + 1][col + 1];

                int currentSum = current + bottom + right + rightBottom;

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    maxMatrix = new int[][]{
                            {current, right},
                            {bottom, rightBottom}
                    };
                }

            }
        }

        printMatrix(maxMatrix);
        System.out.println(maxSum);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(int rows, Scanner scanner, String splitPattern) {
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern))
                    .mapToInt(Integer::parseInt).toArray();
        }

        return matrix;
    }
}