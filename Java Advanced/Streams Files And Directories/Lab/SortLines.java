package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\Java\\src\\JavaAdvanced\\input.txt");

        List<String> lines = Files.readAllLines(path).stream().sorted().collect(Collectors.toList());

        Files.write(Paths.get("D:\\Java\\src\\JavaAdvanced\\outputSL.txt"), lines);
    }
}