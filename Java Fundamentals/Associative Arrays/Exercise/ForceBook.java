package ProgrammingFundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> users = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            String delimiter = "";

            if (input.contains("|")) {
                delimiter = "\\|";
            } else {
                delimiter = "->";
            }

            String[] data = input.split(delimiter);
            String username = "";
            String userSide = "";

            switch (delimiter) {
                case "\\|":
                    userSide = data[0].trim();
                    username = data[1].trim();
                    users.putIfAbsent(userSide, new ArrayList<>());

                    if (!users.get(userSide).contains(username)) {
                        users.get(userSide).add(username);
                    }
                    break;
                case "->":
                    username = data[0].trim();
                    userSide = data[1].trim();

                    for (Map.Entry<String, List<String>> entry : users.entrySet()) {
                        if (entry.getValue().contains(username)) {
                            entry.getValue().remove(username);
                        }
                    }

                    users.putIfAbsent(userSide, new ArrayList<>());

                    if (!users.get(userSide).contains(username)) {
                        users.get(userSide).add(username);
                    }

                    System.out.printf("%s joins the %s side!%n", username, userSide);
                    break;
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : users.entrySet()) {
            if (entry.getValue().isEmpty()) {
                continue;
            }

            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().forEach(e -> System.out.printf("! %s%n", e));
        }
    }
}