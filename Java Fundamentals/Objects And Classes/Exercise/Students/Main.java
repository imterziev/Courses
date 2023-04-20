package ProgrammingFundamentals.ObjectsAndClasses.Exercise.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Students> studentsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            double grade = Double.parseDouble(data[2]);

            Students student = new Students(firstName, lastName, grade);
            studentsList.add(student);
        }

        studentsList.sort(Comparator.comparingDouble(Students::getGrade).reversed());

        for (Students students : studentsList) {
            System.out.println(students);
        }
    }
}