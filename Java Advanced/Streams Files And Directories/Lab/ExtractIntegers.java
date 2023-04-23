package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java\\src\\JavaAdvanced";

        FileInputStream inputStream = new FileInputStream(path + "\\" + "input.txt");

        PrintStream printStream = new PrintStream(path + "\\" + "outputEI.txt");

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                printStream.println(number);
            }

            scanner.next();
        }

        inputStream.close();
    }
}