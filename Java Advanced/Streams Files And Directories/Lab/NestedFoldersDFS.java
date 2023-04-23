package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NestedFoldersDFS {
    public static void main(String[] args) {

        Path path = Paths.get("D:\\Java\\src\\JavaAdvanced");

        File root = path.toFile();

        dfs(root);
    }

    private static void dfs(File file) {
        System.out.println(file.getName());

        File[] files = file.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    dfs(f);
                } else {
                    System.out.println(f.getName());
                }
            }
        }
    }
}