package ProgrammingFundamentals.MidExam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        int[] studentsArray = new int[students];

        for (int i = 0; i < studentsArray.length; i++) {
            studentsArray[i] += Integer.parseInt(scanner.nextLine());
        }

        int getMax = 0;

        for (int i = 0; i < studentsArray.length; i++) {
            if (getMax < studentsArray[i]) {
                getMax = studentsArray[i];
            }
        }

        double totalBonus = (double) getMax / lectures * (5 + additionalBonus);

        if (Double.isNaN(totalBonus)) {
            totalBonus = 0;
        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(totalBonus));
        System.out.printf("The student has attended %d lectures.", getMax);
    }
}