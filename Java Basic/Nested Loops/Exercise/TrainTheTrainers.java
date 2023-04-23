package ProgrammingBasic.NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int judge = Integer.parseInt(scanner.nextLine());

        String name = scanner.nextLine();
        double grade = 0;
        double totalGrade = 0;
        double finalGrade = 0;
        int count = 0;

        while (!name.equals("Finish")) {

            count++;

            for (int i = 0; i < judge; i++) {

                grade = Double.parseDouble(scanner.nextLine());

                totalGrade += grade;
            }

            totalGrade /= judge;

            finalGrade += totalGrade;

            System.out.printf("%s - %.2f.%n", name, totalGrade);

            totalGrade = 0;

            name = scanner.nextLine();
        }

        if (name.equals("Finish")) {
            System.out.printf("Student's final assessment is %.2f.", finalGrade / count);
        }
    }
}