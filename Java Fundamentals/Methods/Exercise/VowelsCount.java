package ProgrammingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        vowelsCount(input);
    }

    private static void vowelsCount(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char letters = input.charAt(i);

            switch (letters) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    sum++;
                    break;
            }
        }

        System.out.println(sum);
    }
}