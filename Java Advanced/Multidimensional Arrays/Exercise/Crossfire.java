package JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        List<List<Integer>> matrix = readMatrix(rows, cols);

        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            String[] destroyingData = input.split("\\s+");
            int targetRow = Integer.parseInt(destroyingData[0]);
            int targetCol = Integer.parseInt(destroyingData[1]);
            int targetRadius = Integer.parseInt(destroyingData[2]);

            for (int row = targetRow - targetRadius; row <= targetRow + targetRadius; row++) {
                if (isInRange(row, targetCol, matrix) && row != targetRow) {
                    matrix.get(row).remove(targetCol);
                }
            }

            for (int col = targetCol + targetRadius; col >= targetCol - targetRadius; col--) {
                if (isInRange(targetRow, col, matrix)) {
                    matrix.get(targetRow).remove(col);
                }
            }

            matrix.removeIf(List::isEmpty);

            input = scanner.nextLine();
        }

        for (List<Integer> integers : matrix) {
            for (Integer i : integers) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    private static boolean isInRange(int row, int targetCol, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && targetCol >= 0 && targetCol < matrix.get(row).size();
    }

    private static List<List<Integer>> readMatrix(int rows, int cols) {
        List<List<Integer>> matrix = new ArrayList<>();

        int startElement = 1;

        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());

            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(startElement++);
            }
        }

        return matrix;
    }
}