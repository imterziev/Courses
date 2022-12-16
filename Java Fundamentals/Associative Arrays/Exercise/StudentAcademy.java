package ProgrammingFundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        students.entrySet().stream()
                .forEach(entry ->
                {
                    double average = entry.getValue()
                            .stream()
                            .mapToDouble(x -> x)
                            .average()
                            .orElse(0.0);

                    if (average >= 4.50) {
                        System.out.printf("%s -> %.2f%n", entry.getKey(), average);
                    }
                });
    }
}