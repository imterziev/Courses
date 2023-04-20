package ProgrammingFundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> groceryList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] commands = input.split("\\s+");

            switch (commands[0]) {
                case "Urgent":
                    if (!groceryList.contains(commands[1])) {
                        groceryList.add(0, commands[1]);
                    }
                    break;
                case "Unnecessary":
                    if (groceryList.contains(commands[1])) {
                        groceryList.remove(commands[1]);
                    }
                    break;
                case "Correct":
                    if (groceryList.contains(commands[1])) {
                        groceryList.set(groceryList.indexOf(commands[1]), commands[2]);
                    }
                    break;
                case "Rearrange":
                    if (groceryList.contains(commands[1])) {
                        groceryList.add(commands[1]);
                        groceryList.remove(commands[1]);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", groceryList));
    }
}