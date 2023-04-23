package JavaAdvanced.StreamsFilesAndDirectories.Exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java\\src\\JavaAdvanced\\";

        FileInputStream fileInputStream = new FileInputStream(path + "input.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(path + "outputCCT.txt");

        PrintStream printStream = new PrintStream(fileOutputStream);

        int oneByte = fileInputStream.read();

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> punctuation = Set.of('!', ',', '.', '?');

        int countVowels = 0;
        int countPunctuation = 0;
        int countOtherSymbols = 0;

        while (oneByte != -1) {
            char currentChar = (char) oneByte;

            if (currentChar != 10 && currentChar != 13 && currentChar != 32) {
                if (vowels.contains(currentChar)) {
                    countVowels++;
                } else if (punctuation.contains(currentChar)) {
                    countPunctuation++;
                } else {
                    countOtherSymbols++;
                }
            }

            oneByte = fileInputStream.read();
        }

        printStream.printf("Vowels: %d\n", countVowels);
        printStream.printf("Other symbols: %d\n", countOtherSymbols);
        printStream.printf("Punctuation: %d\n", countPunctuation);

        fileInputStream.close();
        printStream.close();
        fileOutputStream.close();
    }
}