package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java\\src\\JavaAdvanced";

        FileInputStream inputStream = new FileInputStream(path + "\\" + "input.txt");

        FileOutputStream outputStream = new FileOutputStream(path + "\\" + "outputCB.txt");

        PrintStream printStream = new PrintStream(outputStream);

        int oneByte = inputStream.read();

        while (oneByte != -1) {
            if (oneByte != 10 && oneByte != 32) {
                printStream.print(oneByte);
            } else {
                printStream.print((char) oneByte);
            }

            oneByte = inputStream.read();
        }

        inputStream.close();
        outputStream.close();
    }
}