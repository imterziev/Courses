package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        String path = "D:\\Java\\src\\JavaAdvanced\\input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);

            int oneByte = inputStream.read();

            while (oneByte != -1) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));

                oneByte = inputStream.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Program Completed!");
        }
    }
}