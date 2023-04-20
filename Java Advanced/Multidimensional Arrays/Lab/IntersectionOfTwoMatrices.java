package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows, cols, scanner);
        char[][] secondMatrix = readMatrix(rows, cols, scanner);

        char[][] outputMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char fillChar = firstMatrix[row][col] == secondMatrix[row][col]
                        ? firstMatrix[row][col] : '*';

                outputMatrix[row][col] = fillChar;
            }
        }

        printMatrix(outputMatrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }

            System.out.println();
        }
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {

            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i++) {
                char currentElement = input[i].charAt(0);
                matrix[row][i] = currentElement;
            }
        }

        return matrix;
    }
}