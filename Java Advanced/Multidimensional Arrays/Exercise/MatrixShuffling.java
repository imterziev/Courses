package JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String[][] matrix = readMatrix(rows, cols, scanner);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if (!command.equals("swap")) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }

            if (tokens.length != 5) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }

            int firstRow = Integer.parseInt(tokens[1]);
            int firstCol = Integer.parseInt(tokens[2]);
            int secondRow = Integer.parseInt(tokens[3]);
            int secondCol = Integer.parseInt(tokens[4]);

            if (firstRow >= rows || firstRow < 0
                    || firstCol >= cols || firstCol < 0
                    || secondRow >= rows || secondRow < 0
                    || secondCol >= cols || secondCol < 0) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }

            String firstElement = matrix[firstRow][firstCol];
            String secondElement = matrix[secondRow][secondCol];

            matrix[firstRow][firstCol] = secondElement;
            matrix[secondRow][secondCol] = firstElement;

            printMatrix(matrix);

            input = scanner.nextLine();
        }

        System.out.println();
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] arr : matrix) {
            for (String s : arr) {
                System.out.print(s + " ");
            }

            System.out.println();
        }
    }

    private static String[][] readMatrix(int rows, int cols, Scanner scanner) {
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }

        return matrix;
    }
}