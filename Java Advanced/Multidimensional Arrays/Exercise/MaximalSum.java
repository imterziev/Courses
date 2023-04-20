package JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = readMatrix(rows, cols, scanner);

        int[][] maxMatrix = new int[3][3];

        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int left = matrix[row][col];
                int middle = matrix[row][col + 1];
                int right = matrix[row][col + 2];

                int middleLeft = matrix[row + 1][col];
                int middleMiddle = matrix[row + 1][col + 1];
                int middleRight = matrix[row + 1][col + 2];

                int bottomLeft = matrix[row + 2][col];
                int bottomMiddle = matrix[row + 2][col + 1];
                int bottomRight = matrix[row + 2][col + 2];

                int currentSum = left + middle + right
                        + middleLeft + middleMiddle + middleRight
                        + bottomLeft + bottomMiddle + bottomRight;

                if (maxSum < currentSum) {
                    maxSum = currentSum;

                    maxMatrix = new int[][]{
                            {left, middle, right},
                            {middleLeft, middleMiddle, middleRight},
                            {bottomLeft, bottomMiddle, bottomRight},
                    };
                }
            }
        }

        System.out.println("Sum = " + maxSum);

        printMatrix(maxMatrix);
    }

    private static void printMatrix(int[][] maxMatrix) {
        for (int[] arr : maxMatrix) {
            for (int i : arr) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        return matrix;
    }
}