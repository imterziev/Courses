package JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = readMatrix(rows, cols);

        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] arr : matrix) {
            for (String i : arr) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    private static String[][] readMatrix(int rows, int cols) {
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char charAtRow = (char) (97 + row);
                char charAtCol = (char) (97 + col + row);

                String element = String.valueOf(charAtRow) + String.valueOf(charAtCol) + String.valueOf(charAtRow);
                matrix[row][col] = element;
            }
        }

        return matrix;
    }
}