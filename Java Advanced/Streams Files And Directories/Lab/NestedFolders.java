package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) {

        Path path = Paths.get("D:\\Java\\src\\JavaAdvanced");

        File root = path.toFile();

        Deque<File> queue = new ArrayDeque<>();

        queue.offer(root);

        System.out.println(queue.peek().getName());

        int counter = 1;

        while (!queue.isEmpty()) {
            File file = queue.poll();

            File[] files = file.listFiles();

            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        queue.offer(f);
                        System.out.println(f.getName());
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter + " folders");
    }
}