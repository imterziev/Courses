package JavaAdvanced.FinalExam;

import java.util.Scanner;

public class ReVolt {
    public static int pRow = 0;
    public static int pCol = 0;
    public static boolean isFinished = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int countOfCommands = Integer.parseInt(scanner.nextLine());

        char[][] matrix = getMatrix(size, scanner);

        while (countOfCommands-- > 0) {
            String command = scanner.nextLine();

            matrix[pRow][pCol] = '-';

            directions(matrix, command);

            matrix[pRow][pCol] = 'f';

            if (isFinished) {
                break;
            }
        }

        String output = isFinished
                ? "Player won!"
                : "Player lost!";

        System.out.println(output);

        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char col : row) {
                System.out.print(col);
            }

            System.out.println();
        }
    }

    private static void directions(char[][] matrix, String command) {
        switch (command) {
            case "up":
                moveInMatrix(matrix, pRow - 1, pCol, command);
                break;
            case "down":
                moveInMatrix(matrix, pRow + 1, pCol, command);
                break;
            case "left":
                moveInMatrix(matrix, pRow, pCol - 1, command);
                break;
            case "right":
                moveInMatrix(matrix, pRow, pCol + 1, command);
                break;
        }
    }

    private static void moveInMatrix(char[][] matrix, int newRow, int newCol, String command) {
        if (isInBounds(matrix, newRow, newCol)) {
            int[] newIndexes = getNewIndexes(matrix, newRow, newCol);

            newRow = newIndexes[0];
            newCol = newIndexes[1];
        }

        if (matrix[newRow][newCol] == 'B') {
            pRow = newRow;
            pCol = newCol;

            directions(matrix, command);

            newRow = pRow;
            newCol = pCol;
        }

        if (matrix[newRow][newCol] == 'T') {
            newRow = pRow;
            newCol = pCol;
        }

        if (matrix[newRow][newCol] == 'F') {
            isFinished = true;
        }

        pRow = newRow;
        pCol = newCol;
    }

    private static int[] getNewIndexes(char[][] matrix, int newRow, int newCol) {
        int[] indexes = new int[2];

        if (newRow < 0) {
            indexes[0] = matrix.length - 1;
            indexes[1] = newCol;
        } else if (newRow >= matrix.length) {
            indexes[1] = newCol;
        } else if (newCol < 0) {
            indexes[0] = newRow;
            indexes[1] = matrix.length - 1;
        } else if (newCol >= matrix.length) {
            indexes[0] = newRow;
        }

        return indexes;
    }

    private static boolean isInBounds(char[][] matrix, int newRow, int newCol) {
        return newRow < 0 || newRow >= matrix.length || newCol < 0 || newCol >= matrix.length;
    }

    private static char[][] getMatrix(int size, Scanner scanner) {
        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            matrix[row] = line.toCharArray();

            if (line.contains("f")) {
                pRow = row;
                pCol = line.indexOf("f");
            }
        }

        return matrix;
    }
}