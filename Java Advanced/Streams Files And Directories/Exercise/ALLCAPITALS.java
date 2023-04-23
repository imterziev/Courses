package JavaAdvanced.StreamsFilesAndDirectories.Exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java\\src\\JavaAdvanced\\";

        FileInputStream fileInputStream = new FileInputStream(path + "input.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(path + "outputAC.txt");

        Scanner scanner = new Scanner(fileInputStream);

        PrintStream printStream = new PrintStream(fileOutputStream);

        while (scanner.hasNext()) {
            printStream.println(scanner.nextLine().toUpperCase());
        }

        fileInputStream.close();
        fileOutputStream.close();
        printStream.close();
    }
}