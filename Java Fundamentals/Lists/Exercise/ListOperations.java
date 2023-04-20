package ProgrammingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            manipulatingList(numbers, input);

            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void manipulatingList(List<Integer> numbers, String input) {
        List<String> commands = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());

        switch (commands.get(0)) {
            case "Add":
                numbers.add(Integer.parseInt(commands.get(1)));
                break;
            case "Insert":
                if (Integer.parseInt(commands.get(2)) >= 0 && Integer.parseInt(commands.get(2)) < numbers.size()) {
                    numbers.add(Integer.parseInt(commands.get(2)), Integer.parseInt(commands.get(1)));
                } else {
                    System.out.println("Invalid index");
                }
                break;
            case "Remove":
                if (Integer.parseInt(commands.get(1)) >= 0 && Integer.parseInt(commands.get(1)) < numbers.size()) {
                    numbers.remove(Integer.parseInt(commands.get(1)));
                } else {
                    System.out.println("Invalid index");
                }
                break;
            case "Shift":
                if (commands.get(1).equals("left")) {
                    getShiftLeft(numbers, commands.get(2));
                } else {
                    getShiftRight(numbers, commands.get(2));
                }
                break;
        }
    }

    private static void getShiftLeft(List<Integer> numbers, String s) {
        int counter = 0;

        for (int i = 0; i < Integer.parseInt(s); i++) {
            numbers.add(numbers.get(i));
            numbers.remove(i);
            i--;
            counter++;
            if (counter == Integer.parseInt(s)) {
                break;
            }
        }
    }

    private static void getShiftRight(List<Integer> numbers, String s) {
        int counter = 0;

        for (int i = 0; i < Integer.parseInt(s); i++) {
            numbers.add(0, numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
            i--;
            counter++;
            if (counter == Integer.parseInt(s)) {
                break;
            }
        }
    }
}