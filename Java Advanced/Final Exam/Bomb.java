package JavaAdvanced.FinalExam;

import java.util.Scanner;

public class Bomb {
    public static int sRow = 0;
    public static int sCol = 0;
    public static int eRow = 0;
    public static int eCol = 0;
    public static int bombs = 0;
    public static boolean isEnd = false;
    public static boolean isBombFound = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(",");

        char[][] matrix = getMatrix(size, scanner);

        for (String command : commands) {
            switch (command) {
                case "up":
                    moveInMatrix(matrix, sRow - 1, sCol);
                    break;
                case "down":
                    moveInMatrix(matrix, sRow + 1, sCol);
                    break;
                case "left":
                    moveInMatrix(matrix, sRow, sCol - 1);
                    break;
                case "right":
                    moveInMatrix(matrix, sRow, sCol + 1);
                    break;
            }

            if (isBombFound) {
                System.out.println("You found a bomb!");
                isBombFound = false;
            }

            if (isEnd || bombs == 0) {
                break;
            }
        }

        if (bombs == 0) {
            System.out.println("Congratulations! You found all bombs!");
        } else if (isEnd) {
            System.out.printf("END! %d bombs left on the field\n", bombs);
        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombs, sRow, sCol);
        }
    }

    private static void moveInMatrix(char[][] matrix, int newRow, int newCol) {
        if (isInBounds(matrix, newRow, newCol)) {
            newRow = sRow;
            newCol = sCol;
        }

        if (matrix[newRow][newCol] == 'B') {
            matrix[newRow][newCol] = '+';
            isBombFound = true;
            bombs--;
        } else if (matrix[newRow][newCol] == 'e') {
            isEnd = true;
        }

        sRow = newRow;
        sCol = newCol;
    }

    private static boolean isInBounds(char[][] matrix, int newRow, int newCol) {
        return newRow < 0 || newRow >= matrix.length || newCol < 0 || newCol >= matrix.length;
    }

    private static char[][] getMatrix(int size, Scanner scanner) {
        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            matrix[row] = line.toCharArray();

            for (char c : matrix[row]) {
                if (c == 'B') {
                    bombs++;
                } else if (c == 'e') {
                    eRow = row;
                    eCol = line.indexOf(c);
                } else if (c == 's') {
                    sRow = row;
                    sCol = line.indexOf(c);
                }
            }
        }

        return matrix;
    }
}