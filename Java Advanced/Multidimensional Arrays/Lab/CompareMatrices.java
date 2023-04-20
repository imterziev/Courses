package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().split("\\s+")[0]);

        int[][] firstMatrix = readMatrix(rows, scanner);

        rows = Integer.parseInt(scanner.nextLine().split("\\s+")[0]);

        int[][] secondMatrix = readMatrix(rows, scanner);

        boolean areEqual = areEqual(firstMatrix, secondMatrix);

        String output = areEqual ? "equal" : "not equal";

        System.out.println(output);
    }

    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];

            if (firstArr.length != secondArr.length) {
                return false;
            }

            for (int i = 0; i < firstArr.length; i++) {
                if (firstArr[i] != secondArr[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        return matrix;
    }
}