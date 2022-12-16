package ProgrammingFundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> usersResults = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] data = input.split("-");
            String username = data[0];

            if (!data[1].equals("banned")) {
                String language = data[1];
                int points = Integer.parseInt(data[2]);

                usersResults.putIfAbsent(username, 0);

                if (usersResults.get(username) < points) {
                    usersResults.put(username, points);
                }

                submissions.putIfAbsent(language, 0);
                submissions.put(language, submissions.get(language) + 1);
            } else {
                usersResults.remove(username);
            }

            input = scanner.nextLine();
        }

        System.out.println("Results:");

        usersResults.entrySet().stream()
                .forEach(entry -> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));

        System.out.println("Submissions:");

        submissions.entrySet().stream()
                .forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));
    }
}