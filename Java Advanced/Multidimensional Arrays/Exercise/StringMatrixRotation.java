package JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();

        String regex = "[A-Z]+[a-z]+\\((?<degrees>[0-9]+)\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rotation);

        int degrees = 0;

        if (matcher.find()) {
            degrees = Integer.parseInt(matcher.group("degrees"));
        }

        degrees /= 90;

        if (degrees == 0 || degrees == 1 || degrees == 2 || degrees == 3) {

        } else {
            if (degrees % 4 == 0) {
                degrees = 0;
            } else {
                while (degrees >= 5) {
                    degrees -= 4;
                }

            }
        }

        String input = scanner.nextLine();

        List<String> elements = new ArrayList<>();

        int maxLenght = Integer.MIN_VALUE;

        while (!input.equals("END")) {
            if (maxLenght < input.length()) {
                maxLenght = input.length();
            }

            elements.add(input);

            input = scanner.nextLine();
        }

        char[][] matrix = readMatrix(degrees, scanner, elements.size(), elements, maxLenght);

        printMatrix(matrix);
        System.out.println();

    }

    private static void printMatrix(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char c : arr) {
                System.out.print(c);
            }

            System.out.println();
        }
    }

    private static char[][] readMatrix(int degrees, Scanner scanner, int size, List<String> elements, int maxLength) {
        int rows = 0;
        int cols = 0;

        if (degrees == 0 || degrees == 2) {
            rows = size;
            cols = maxLength;
        } else {
            rows = maxLength;
            cols = size;
        }

        char[][] matrix = new char[rows][cols];

        if (degrees == 0) {
            for (int row = 0; row < size; row++) {
                String currentElement = elements.get(row);

                int lengthToAdd = maxLength - currentElement.length();
                String empty = "";

                for (int i = 1; i <= lengthToAdd; i++) {
                    empty += " ";
                }

                String output = currentElement + empty;

                for (int col = 0; col < output.length(); col++) {
                    char currentChar = output.charAt(col);

                    matrix[row][col] = currentChar;
                }
            }
        } else if (degrees == 1) {
            for (int col = 0; col < size; col++) {
                String currentElement = elements.get(elements.size() - 1 - col);

                int lengthToAdd = maxLength - currentElement.length();
                String empty = "";

                for (int i = 1; i <= lengthToAdd; i++) {
                    empty += " ";
                }

                String output = currentElement + empty;

                for (int row = 0; row < output.length(); row++) {
                    char currentChar = output.charAt(row);

                    matrix[row][col] = currentChar;
                }
            }
        } else if (degrees == 2) {
            for (int row = 0; row < size; row++) {
                String currentElement = elements.get(elements.size() - 1 - row);
                int lengthToAdd = maxLength - currentElement.length();
                String empty = "";

                for (int i = 1; i <= lengthToAdd; i++) {
                    empty += " ";
                }

                String output = currentElement + empty;

                int i = 0;

                for (int col = output.length() - 1; col >= 0; col--) {
                    char currentChar = output.charAt(col);
                    matrix[row][i++] = currentChar;
                }
            }
        } else if (degrees == 3) {
            for (int col = 0; col < size; col++) {
                String currentElement = elements.get(col);

                int lengthToAdd = maxLength - currentElement.length();
                String empty = "";
                String reversedCurrent = "";

                for (int i = currentElement.length() - 1; i >= 0; i--) {
                    reversedCurrent += currentElement.charAt(i);
                }

                for (int i = 1; i <= lengthToAdd; i++) {
                    empty += " ";
                }

                String output = empty + reversedCurrent;

                for (int row = output.length() - 1; row >= 0; row--) {
                    char currentChar = output.charAt(row);

                    matrix[row][col] = currentChar;
                }
            }
        }

        return matrix;
    }
}