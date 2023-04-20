package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsToAdd = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsRecord = new TreeMap<>();

        for (int i = 0; i < studentsToAdd; i++) {
            String[] studentData = scanner.nextLine().split("\\s+");
            String student = studentData[0];
            double grade = Double.parseDouble(studentData[1]);

            studentsRecord.putIfAbsent(student, new LinkedList<>());
            studentsRecord.get(student).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentsRecord.entrySet()) {
            System.out.printf("%s -> ", entry.getKey());

            entry.getValue().forEach(e -> System.out.printf("%.2f ", e));

            double average = 0;

            for (double d : entry.getValue()) {
                average += d;
            }

            average /= entry.getValue().size();

            System.out.printf("(avg: %.2f)\n", average);

        }
    }
}