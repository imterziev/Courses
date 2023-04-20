package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String splitPattern = "\\s+";
        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(size, scanner, splitPattern);

        int row = 0;
        int col = 0;

        while (row < size && col < size) {
            int current = matrix[row][col];
            System.out.print(current + " ");

            row++;
            col++;
        }

        System.out.println();

        row = size - 1;
        col = 0;

        while (row >= 0 && col < size) {
            int current = matrix[row][col];
            System.out.print(current + " ");

            row--;
            col++;
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