package ProgrammingFundamentals.AssociativeArrays.Lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Map<String, Integer> sequence = new LinkedHashMap<>();

        for (String word : input) {
            String wordToLower = word.toLowerCase();

            sequence.putIfAbsent(wordToLower, 0);
            sequence.put(wordToLower, sequence.get(wordToLower) + 1);
        }

        List<String> oddWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : sequence.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddWords.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddWords));
    }
}