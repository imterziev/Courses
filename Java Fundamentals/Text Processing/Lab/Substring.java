package ProgrammingFundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String words = scanner.nextLine();

        while (words.contains(key)) {
            int index = words.indexOf(key);
            words = words.replace(key, "");
        }

        System.out.println(words);
    }
}