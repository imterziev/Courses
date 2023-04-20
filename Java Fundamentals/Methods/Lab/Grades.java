package ProgrammingFundamentals.Methods.Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        gradeInWords(grade);
    }

    private static void gradeInWords(double grade) {
        String gradeInWords = "";

        if (grade >= 2.00 && grade < 3.00) {
            gradeInWords = "Fail";
        } else if (grade < 3.50) {
            gradeInWords = "Poor";
        } else if (grade < 4.50) {
            gradeInWords = "Good";
        } else if (grade < 5.50) {
            gradeInWords = "Very good";
        } else if (grade <= 6.00) {
            gradeInWords = "Excellent";
        }

        System.out.println(gradeInWords);
    }
}