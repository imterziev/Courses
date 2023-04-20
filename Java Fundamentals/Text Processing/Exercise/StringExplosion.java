package ProgrammingFundamentals.TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StringExplosion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        List<Character> chars = new ArrayList<>();

        for (char c : input) {
            chars.add(c);
        }

        int strength = 0;

        for (int i = 0; i < chars.size(); i++) {
            if (strength > 0 && chars.get(i) != '>') {
                chars.remove(i);
                strength--;
                i--;
            } else if (chars.get(i) == '>') {
                strength += Integer.parseInt(String.valueOf(chars.get(i + 1)));
            }
        }

        for (char c : chars) {
            System.out.print(c);
        }
    }
}