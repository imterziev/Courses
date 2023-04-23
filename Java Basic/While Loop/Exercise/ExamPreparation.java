package ProgrammingBasic.WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fail = Integer.parseInt(scanner.nextLine());

        String exercise = scanner.nextLine();

        String lastExercise = "";
        int grades = 0;
        int poorGrades = 0;
        int numberExercise = 0;
        double totalGrades = 0;

        while (!exercise.equals("Enough")) {

            grades = Integer.parseInt(scanner.nextLine());

            if (grades <= 4) {
                poorGrades++;
            }

            if (poorGrades >= fail) {
                System.out.printf("You need a break, %d poor grades.", poorGrades);
                break;
            }

            totalGrades += grades;
            lastExercise = exercise;

            numberExercise++;
            exercise = scanner.nextLine();
        }

        if (exercise.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", totalGrades / numberExercise);
            System.out.printf("Number of problems: %d%n", numberExercise);
            System.out.printf("Last problem: %s", lastExercise);
        }
    }
}