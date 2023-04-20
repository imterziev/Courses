package ProgrammingFundamentals.Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        listManipulation(numbers, scanner);

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void listManipulation(List<Integer> numbers, Scanner scanner) {
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> command = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            switch (command.get(0)) {
                case "Add":
                    commandAdd(command.get(1), numbers);
                    break;
                case "Remove":
                    commandRemove(command.get(1), numbers);
                    break;
                case "RemoveAt":
                    commandRemoveAt(command.get(1), numbers);
                    break;
                case "Insert":
                    commandInsert(command.get(1), command.get(2), numbers);
                    break;
            }

            input = scanner.nextLine();
        }
    }

    private static void commandAdd(String s, List<Integer> numbers) {
        numbers.add(Integer.parseInt(s));
    }

    private static void commandRemove(String s, List<Integer> numbers) {
        numbers.remove(Integer.valueOf(s));
    }

    private static void commandRemoveAt(String s, List<Integer> numbers) {
        numbers.remove(Integer.parseInt(s));
    }

    private static void commandInsert(String s, String second, List<Integer> numbers) {
        numbers.add(Integer.parseInt(second), Integer.parseInt(s));
    }
}