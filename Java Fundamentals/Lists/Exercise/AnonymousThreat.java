package ProgrammingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String[] commands = input.split("\\s+");

            switch (commands[0]) {
                case "merge":
                    merge(data, commands[1], commands[2]);
                    break;
                case "divide":
                    divide(data, commands[1], commands[2]);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(data.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void merge(List<String> data, String command, String command1) {
        int startIndex = Integer.parseInt(command);

        if (startIndex < 0) {
            startIndex = 0;
        }

        int endIndex = Integer.parseInt(command1);

        if (endIndex >= data.size()) {
            endIndex = data.size() - 1;
        }

        if (startIndex < data.size()) {
            StringBuilder merged = new StringBuilder();
            int counter = startIndex;

            for (int i = startIndex; i <= endIndex; i++) {
                merged.append(data.get(i));
                data.remove(i);
                counter++;
                i--;

                if (counter > endIndex) {
                    break;
                }
            }

            data.add(startIndex, merged.toString());
        }
    }

    private static void divide(List<String> data, String command, String command1) {
        int index = Integer.parseInt(command);
        int partitions = Integer.parseInt(command1);
        String currentElement = data.get(index);

        data.remove(index);

        int loopsNeeded = currentElement.length() / partitions;
        int startIndex = 0;

        for (int i = 1; i < partitions; i++) {
            data.add(index, currentElement.substring(startIndex, startIndex + loopsNeeded));
            index++;
            startIndex += loopsNeeded;
        }

        data.add(index, currentElement.substring(startIndex));
    }
}