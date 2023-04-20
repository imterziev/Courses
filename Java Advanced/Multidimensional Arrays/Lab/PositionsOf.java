package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositionsOf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int number = Integer.parseInt(scanner.nextLine());

        List<int[]> positionsOfNumber = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int currentElement = matrix[row][col];

                if (number == currentElement) {
                    int[] currentPosition = {row, col};
                    positionsOfNumber.add(currentPosition);
                }
            }
        }

        if (positionsOfNumber.isEmpty()) {
            System.out.println("not found");
        } else {
            String output = positionsOfNumber.stream()
                    .map(arr -> arr[0] + " " + arr[1])
                    .collect(Collectors.joining(System.lineSeparator()));

            System.out.println(output);
        }
    }
}