package ProgrammingBasic.WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int grade = 1;
        int fall = 0;
        double totalMarks = 0;

        while (grade <= 12) {

            double mark = Double.parseDouble(scanner.nextLine());

            if (mark >= 4) {
                totalMarks += mark;
                fall = 0;
                grade++;
            } else {
                fall++;

                if (fall > 1) {
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    break;
                }
            }
        }

        if (grade > 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, totalMarks / 12);
        }
    }
}