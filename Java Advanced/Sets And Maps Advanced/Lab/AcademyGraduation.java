package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsData = new TreeMap<>();

        while (numberOfStudents-- > 0) {
            String nameOfStudent = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(Double::parseDouble).collect(Collectors.toList());

            studentsData.putIfAbsent(nameOfStudent, new ArrayList<>());
            studentsData.get(nameOfStudent).addAll(grades);
        }

        studentsData.entrySet().stream()
                .forEach(e -> {
                    DecimalFormat decimalFormat = new DecimalFormat("#.##################");

                    double average = 0;

                    for (double d : e.getValue()) {
                        average += d;
                    }

                    average /= e.getValue().size();

                    String formatAverage = decimalFormat.format(average);

                    System.out.printf("%s is graduated with %s\n", e.getKey(), formatAverage);
                });
    }
}