package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFiles {
    public static void main(String[] args) {

        Path path = Paths.get("D:\\Java\\src\\JavaAdvanced");

        File file = path.toFile();

        File[] files = file.listFiles();

        for (File file1 : files) {
            if (!file1.isDirectory()) {
                System.out.printf("%s: [%d]\n", file1.getName(), file1.length());
            }
        }
    }
}