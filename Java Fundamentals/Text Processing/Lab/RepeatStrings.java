package ProgrammingFundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : array) {
            for (int i = 0; i < word.length(); i++) {
                result.append(word);
            }
        }

        System.out.println(result);
    }
}