package JavaAdvanced.StreamsFilesAndDirectories.Exercise;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String firstPath = "D:\\Java\\src\\JavaAdvanced\\inputOne.txt";
        String secondPath = "D:\\Java\\src\\JavaAdvanced\\inputTwo.txt";
        String outputPath = "D:\\Java\\src\\JavaAdvanced\\outputMTF.txt";

        List<String> firstList = Files.readAllLines(Path.of(firstPath));
        List<String> secondList = Files.readAllLines(Path.of(secondPath));

        PrintStream printStream = new PrintStream(outputPath);

        firstList.forEach(line -> printStream.println(line));
        secondList.forEach(line -> printStream.println(line));

        printStream.close();
    }
}