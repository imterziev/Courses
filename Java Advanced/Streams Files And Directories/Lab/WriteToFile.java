package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java\\src\\JavaAdvanced\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("D:\\Java\\src\\JavaAdvanced\\outputWF.txt");

        Set<Character> symbolsToEscape = Set.of(',', '.', '!', '?');

        int oneByte = inputStream.read();

        while (oneByte != -1) {
            char currentChar = (char) oneByte;

            if (!symbolsToEscape.contains(currentChar)) {
                outputStream.write(currentChar);
            }

            oneByte = inputStream.read();
        }

        inputStream.close();
        outputStream.close();
    }
}