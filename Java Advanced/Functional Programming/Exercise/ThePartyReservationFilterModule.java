package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        List<String> commands = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("Print")) {
            String[] tokens = input.split(";");
            String command = tokens[0];
            String type = tokens[1];
            String paramToCheck = tokens[2];

            String commandToAdd = type + ";" + paramToCheck;

            if (command.equals("Add filter")) {
                commands.add(commandToAdd);
            } else {
                commands.remove(commandToAdd);
            }

            input = scanner.nextLine();
        }

        for (String command : commands) {
            String[] tokens = command.split(";");
            String type = tokens[0];
            String paramToCheck = tokens[1];

            guests.removeIf(getPredicate(type, paramToCheck));
        }

        System.out.println(String.join(" ", guests));
    }

    private static Predicate<String> getPredicate(String type, String paramToCheck) {
        switch (type) {
            case "Starts with":
                return guest -> guest.startsWith(paramToCheck);
            case "Ends with":
                return guest -> guest.endsWith(paramToCheck);
            case "Length":
                return guest -> guest.length() == Integer.parseInt(paramToCheck);
            case "Contains":
                return guest -> guest.contains(paramToCheck);
        }

        return guest -> false;
    }
}