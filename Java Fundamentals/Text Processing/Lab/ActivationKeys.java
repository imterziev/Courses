package ProgrammingFundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder key = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] data = input.split(">>>");

            switch (data[0]) {
                case "Contains":
                    if (key.toString().contains(data[1])) {
                        System.out.printf("%s contains %s%n", key, data[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(data[2]);
                    int endIndex = Integer.parseInt(data[3]);

                    if (data[1].equals("Upper")) {
                        key.replace(startIndex, endIndex, key.substring(startIndex, endIndex).toUpperCase());
                    } else {
                        key.replace(startIndex, endIndex, key.substring(startIndex, endIndex).toLowerCase());
                    }

                    System.out.println(key);
                    break;
                case "Slice":
                    int sliceBegin = Integer.parseInt(data[1]);
                    int sliceEnd = Integer.parseInt(data[2]);

                    key.delete(sliceBegin, sliceEnd);

                    System.out.println(key);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", key);
    }
}