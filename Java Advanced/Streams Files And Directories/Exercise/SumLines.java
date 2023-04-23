package JavaAdvanced.StreamsFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java\\src\\JavaAdvanced\\input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line = bufferedReader.readLine();

        while (line != null) {
            int sum = 0;

            for (char c : line.toCharArray()) {
                sum += c;
            }

            System.out.println(sum);

            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}