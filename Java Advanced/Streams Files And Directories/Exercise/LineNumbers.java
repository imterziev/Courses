package JavaAdvanced.StreamsFilesAndDirectories.Exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java\\src\\JavaAdvanced\\";

        FileInputStream fileInputStream = new FileInputStream(path + "inputLineNumbers.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(path + "outputLN.txt");

        Scanner scanner = new Scanner(fileInputStream);

        PrintStream printStream = new PrintStream(fileOutputStream);

        int count = 1;

        while (scanner.hasNext()) {
            printStream.printf("%d. %s\n", count++, scanner.nextLine());
        }

        fileInputStream.close();
        printStream.close();
        fileOutputStream.close();
    }
}