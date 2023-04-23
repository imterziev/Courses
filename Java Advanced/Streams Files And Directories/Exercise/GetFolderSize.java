package JavaAdvanced.StreamsFilesAndDirectories.Exercise;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {

        String path = "D:\\Java\\src\\JavaAdvanced";

        File folder = new File(path);

        File[] fileArr = folder.listFiles();

        int folderSize = 0;

        for (File file : fileArr) {
            folderSize += file.length();
        }

        System.out.printf("Folder size: %d", folderSize);
    }
}