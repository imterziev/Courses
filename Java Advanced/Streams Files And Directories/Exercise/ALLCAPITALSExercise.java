package JavaAdvanced.StreamsFilesAndDirectories.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ALLCAPITALSExercise {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java\\src\\JavaAdvanced\\input.txt";
        String outputPath = "D:\\Java\\src\\JavaAdvanced\\outputAC2.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

        Files.readAllLines(Path.of(path))
                .forEach(line -> {
                    try {
                        bufferedWriter.write(line.toUpperCase());
                        bufferedWriter.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

        bufferedWriter.close();
    }
}