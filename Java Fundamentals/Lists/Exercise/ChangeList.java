package ProgrammingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> command = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());

            if (command.get(0).equals("Delete")) {
                for (int i = 0; i < numbers.size(); i++) {
                    numbers.remove(Integer.valueOf(command.get(1)));
                }
            } else {
                numbers.add(Integer.parseInt(command.get(2)), Integer.parseInt(command.get(1)));
            }

            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}