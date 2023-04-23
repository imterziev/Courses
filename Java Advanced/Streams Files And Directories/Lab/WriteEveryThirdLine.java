package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java\\src\\JavaAdvanced";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path + "\\" + "input.txt")));

        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(path + "\\" + "outputWET.txt"));

        String line = bufferedReader.readLine();

        int count = 1;

        while (line != null) {
            if (count % 3 == 0) {
                bufferedWriter.write(line + "\n");
            }

            line = bufferedReader.readLine();

            count++;
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
