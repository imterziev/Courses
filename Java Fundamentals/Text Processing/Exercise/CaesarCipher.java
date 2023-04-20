package ProgrammingFundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder encrypt = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char replacement = (char) (input.charAt(i) + 3);

            encrypt.append(replacement);
        }

        System.out.println(encrypt);
    }
}