package ProgrammingFundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> program = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] data = input.split("\\:");
            String course = data[0].trim();
            String name = data[1].trim();

            program.putIfAbsent(course, new ArrayList<>());
            program.get(course).add(name);

            input = scanner.nextLine();
        }

        program.entrySet().stream()
                .forEach(entry ->
                {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().forEach(student -> System.out.printf("-- %s%n", student));
                });
    }
}