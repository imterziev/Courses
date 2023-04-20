package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String type = tokens[1];
            String param = tokens[2];

            if (command.equals("Remove")) {
                guests.removeIf(getPredicate(type, param));
            } else {
                for (int i = 0; i < guests.size(); i++) {
                    String guest = guests.get(i);

                    if (getPredicate(type, param).test(guest)) {
                        guests.add(i++, guest);
                    }
                }
            }

            input = scanner.nextLine();
        }

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guests);
            System.out.println(String.format("%s are going to the party!", String.join(", ", guests)));
        }
    }

    private static Predicate<String> getPredicate(String type, String param) {
        switch (type) {
            case "StartsWith":
                return name -> name.startsWith(param);
            case "EndsWith":
                return name -> name.endsWith(param);
            case "Length":
                return name -> name.length() == Integer.parseInt(param);
            default:
                return name -> false;
        }
    }
}