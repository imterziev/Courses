package JavaAdvanced.FinalExam;

import java.util.Scanner;

public class PresentDelivery {
    public static int sRow = 0;
    public static int sCol = 0;
    public static int goodKids = 0;
    public static int gifts = 0;
    public static int givenGifts = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        gifts = Integer.parseInt(scanner.nextLine());

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = getMatrix(size, scanner);

        String command = scanner.nextLine();

        matrix[sRow][sCol] = '-';

        while (!command.equals("Christmas morning")) {
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

            if (gifts <= 0) {
                break;
            }

            command = scanner.nextLine();
        }

        matrix[sRow][sCol] = 'S';

        if (gifts <= 0) {
            System.out.println("Santa ran out of presents!");
        }

        printMatrix(matrix);

        String output = goodKids <= 0
                ? String.format("Good job, Santa! %d happy nice kid/s.\n", givenGifts)
                : String.format("No presents for %d nice kid/s.\n", goodKids);

        System.out.println(output);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char c : row) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }

    private static void moveInMatrix(char[][] matrix, int newRow, int newCol) {
        if (matrix[newRow][newCol] == 'V') {
            gifts--;
            goodKids--;
            givenGifts++;
        } else if (matrix[newRow][newCol] == 'C') {
            giveGifts(matrix, newRow, newCol - 1);
            giveGifts(matrix, newRow, newCol + 1);
            giveGifts(matrix, newRow - 1, newCol);
            giveGifts(matrix, newRow + 1, newCol);
        }

        matrix[newRow][newCol] = '-';

        sRow = newRow;
        sCol = newCol;
    }

    private static void giveGifts(char[][] matrix, int newRow, int newCol) {
        if (matrix[newRow][newCol] == 'V' || matrix[newRow][newCol] == 'X' && gifts > 0) {
            if (matrix[newRow][newCol] == 'V') {
                goodKids--;
            }

            matrix[newRow][newCol] = '-';
            gifts--;
            givenGifts++;
        }
    }

    private static char[][] getMatrix(int size, Scanner scanner) {
        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");

            matrix[row] = line.toCharArray();

            if (line.contains("S")) {
                sRow = row;
                sCol = line.indexOf("S");
            }

            if (line.contains("V")) {
                for (char c : matrix[row]) {
                    if (c == 'V') {
                        goodKids++;
                    }
                }
            }
        }

        return matrix;
    }
}