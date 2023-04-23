package JavaAdvanced.StreamsFilesAndDirectories.Exercise;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {

        Path firstPath = Path.of("D:\\Java\\src\\JavaAdvanced\\words.txt");
        Path secondPath = Paths.get("D:\\Java\\src\\JavaAdvanced\\text.txt");
        String outputPath = "D:\\Java\\src\\JavaAdvanced\\outputWC.txt";

        List<String> words = Files.readAllLines(firstPath);
        List<String> text = Files.readAllLines(secondPath);

        Map<String, Integer> wordsCount = new LinkedHashMap<>();

        words.forEach(line -> Arrays.stream(line.split("\\s+")).forEach(word -> wordsCount.put(word, 0)));

        for (String line : text) {
            String[] wordsInLine = line.split("\\s+");

            Arrays.stream(wordsInLine).forEach(word -> {
                if (wordsCount.containsKey(word)) {
                    wordsCount.put(word, wordsCount.get(word) + 1);
                }
            });
        }

        PrintStream printStream = new PrintStream(outputPath);

        wordsCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> printStream.printf("%s - %d\n", entry.getKey(), entry.getValue()));
    }
}