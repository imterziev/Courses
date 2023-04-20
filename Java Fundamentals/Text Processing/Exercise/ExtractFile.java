package ProgrammingFundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] path = scanner.nextLine().split("\\\\");

        String[] fileInfo = path[path.length - 1].split("\\.");

        String filename = fileInfo[0];
        String extension = fileInfo[1];

        System.out.println("File name: " + filename);
        System.out.println("File extension: " + extension);
    }
}