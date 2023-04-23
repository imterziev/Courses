package JavaAdvanced.StreamsFilesAndDirectories.Exercise;

import java.io.FileInputStream;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java\\src\\JavaAdvanced\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        int oneByte = fileInputStream.read();

        long sum = 0;

        while (oneByte != -1) {
            if (oneByte != 10 && oneByte != 13) {
                sum += oneByte;
            }

            oneByte = fileInputStream.read();
        }

        System.out.println(sum);
    }
}