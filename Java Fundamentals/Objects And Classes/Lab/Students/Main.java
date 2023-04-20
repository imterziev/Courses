package ProgrammingFundamentals.ObjectsAndClasses.Lab.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Students> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String hometown = tokens[3];

            Students student = new Students(firstName, lastName, age, hometown);
            students.add(student);

            input = scanner.nextLine();
        }

        String checkHometown = scanner.nextLine();

        for (Students student : students) {
            if (checkHometown.equals(student.getHometown())) {
                System.out.println(student);
            }
        }
    }
}