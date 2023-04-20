package ProgrammingFundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> journal = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] commands = input.split("\\s+\\-\\s+");

            switch (commands[0]) {
                case "Collect":
                    if (!journal.contains(commands[1])) {
                        journal.add(commands[1]);
                    }
                    break;
                case "Drop":
                    if (journal.contains(commands[1])) {
                        journal.remove(commands[1]);
                    }
                    break;
                case "Combine Items":
                    if (journal.contains(commands[1].split(":")[0])) {
                        journal.add(journal.indexOf(commands[1].split(":")[0]) + 1, commands[1].split(":")[1]);
                    }
                    break;
                case "Renew":
                    if (journal.contains(commands[1])) {
                        journal.add(commands[1]);
                        journal.remove(commands[1]);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", journal));
    }
}