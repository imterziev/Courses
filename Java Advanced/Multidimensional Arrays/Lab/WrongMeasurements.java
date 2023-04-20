package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String splitPattern = "\\s+";
        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(size, scanner, splitPattern);

        int[] wrongValuePosition = Arrays.stream(scanner.nextLine().split(splitPattern))
                .mapToInt(Integer::parseInt).toArray();

        int wrongValue = matrix[wrongValuePosition[0]][wrongValuePosition[1]];

        int[][] outputMatrix = getOutputMatrix(matrix, wrongValue, size);

        printMatrix(outputMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    private static int[][] getOutputMatrix(int[][] matrix, int wrongValue, int size) {
        int[][] outputMatrix = new int[size][matrix[0].length];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int currentValue = matrix[row][col];

                if (currentValue == wrongValue) {
                    int sum = getSum(matrix, row, col, wrongValue);
                    outputMatrix[row][col] = sum;
                } else {
                    outputMatrix[row][col] = currentValue;
                }
            }
        }

        return outputMatrix;
    }

    private static int getSum(int[][] matrix, int row, int col, int wrongValue) {
        int sum = 0;

        if (row - 1 >= 0 && matrix[row - 1][col] != wrongValue) {
            sum += matrix[row - 1][col];
        }

        if (row + 1 < matrix.length && matrix[row + 1][col] != wrongValue) {
            sum += matrix[row + 1][col];
        }

        if (col - 1 >= 0 && matrix[row][col - 1] != wrongValue) {
            sum += matrix[row][col - 1];
        }

        if (col + 1 < matrix[row].length && matrix[row][col + 1] != wrongValue) {
            sum += matrix[row][col + 1];
        }

        return sum;
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