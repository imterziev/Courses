package JavaAdvanced.FinalExam;

import java.util.Scanner;

public class Python {
    static int food, pRow, pCol;
    static int pLength = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(",\\s+");

        char[][] matrix = getMatrix(size, scanner);

        for (String command : commands) {
            switch (command) {
                case "up":
                    movePython(matrix, pRow - 1, pCol);
                    break;
                case "down":
                    movePython(matrix, pRow + 1, pCol);
                    break;
                case "left":
                    movePython(matrix, pRow, pCol - 1);
                    break;
                case "right":
                    movePython(matrix, pRow, pCol + 1);
                    break;
            }

            if (pLength == -1 || food == 0) {
                break;
            }
        }

        if (food == 0) {
            System.out.printf("You win! Final python length is %d", pLength);
        } else if (food > 0 && pLength != -1) {
            System.out.printf("You lose! There is still %d food to be eaten.", food);
        } else {
            System.out.println("You lose! Killed by an enemy!");
        }
    }

    private static void movePython(char[][] matrix, int newRow, int newCol) {
        if (isOutOfBounds(matrix, newRow, newCol)) {
            int[] newIndexes = flipSide(matrix.length, newRow, newCol);
            newRow = newIndexes[0];
            newCol = newIndexes[1];
        }

        if (matrix[newRow][newCol] == 'e') {
            pLength = -1;
        } else if (matrix[newRow][newCol] == 'f') {
            pLength++;
            food--;
        }

        pRow = newRow;
        pCol = newCol;
    }

    private static int[] flipSide(int length, int newRow, int newCol) {
        int[] result = new int[2];

        if (newRow < 0) {
            result[0] = length - 1;
            result[1] = newCol;
        } else if (newRow >= length) {
            result[1] = newCol;
        } else if (newCol < 0) {
            result[0] = newRow;
            result[1] = length - 1;
        } else {
            result[0] = newRow;
        }

        return result;
    }

    private static boolean isOutOfBounds(char[][] matrix, int newRow, int newCol) {
        return newRow < 0 || newRow >= matrix.length || newCol < 0 || newCol >= matrix.length;
    }

    private static char[][] getMatrix(int size, Scanner scanner) {
        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            matrix[row] = line.toCharArray();

            if (line.contains("s")) {
                pRow = row;
                pCol = line.indexOf("s");
            }

            if (line.contains("f")) {
                for (char c : matrix[row]) {
                    if (c == 'f') {
                        food++;
                    }
                }
            }
        }

        return matrix;
    }
}