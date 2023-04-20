package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.List;
import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];

        for (int row = 0; row < 8; row++) {
            matrix[row] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'q') {
                    if (checkQueen(matrix, row, col)) {
                        System.out.println(row + " " + col);
                    }
                }
            }
        }
    }

    private static boolean checkQueen(char[][] matrix, int rows, int cols) {
        for (int row = rows - 1; row >= 0; row--) {
            if (matrix[row][cols] == 'q') {
                return false;
            }
        }

        for (int row = rows + 1; row < matrix.length; row++) {
            if (matrix[row][cols] == 'q') {
                return false;
            }
        }

        for (int col = cols - 1; col >= 0; col--) {
            if (matrix[rows][col] == 'q') {
                return false;
            }
        }

        for (int col = cols + 1; col < matrix.length; col++) {
            if (matrix[rows][col] == 'q') {
                return false;
            }
        }

        int row = rows - 1;
        int col = cols - 1;

        while (row >= 0 && col >= 0) {
            if (matrix[row--][col--] == 'q') {
                return false;
            }
        }

        row = rows - 1;
        col = cols + 1;

        while (row >= 0 && col < matrix.length) {
            if (matrix[row--][col++] == 'q') {
                return false;
            }
        }

        row = rows + 1;
        col = cols - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row++][col--] == 'q') {
                return false;
            }
        }

        row = rows + 1;
        col = cols + 1;

        while (row < matrix.length && col < matrix.length) {
            if (matrix[row++][col++] == 'q') {
                return false;
            }
        }

        return true;
    }
}