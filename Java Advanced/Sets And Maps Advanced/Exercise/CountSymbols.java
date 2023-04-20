package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            symbols.putIfAbsent(currentChar, 0);
            symbols.put(currentChar, symbols.get(currentChar) + 1);
        }

        symbols.entrySet().stream()
                .forEach(e -> System.out.printf("%c: %d time/s\n", e.getKey(), e.getValue()));
    }
}