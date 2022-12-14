package ProgrammingFundamentals.Arrays.Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            String[] temp = new String[input.length];

            temp[i] = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp[i];
        }

        System.out.print(String.join(" ", input));
    }
}