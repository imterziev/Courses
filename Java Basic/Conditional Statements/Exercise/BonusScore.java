package ProgrammingBasic.ConditionalStatements.Exercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingPoints = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (startingPoints % 2 == 0) {
            bonusPoints = 1;
        } else if (startingPoints % 5 == 0) {
            bonusPoints = 2;
        }

        if (startingPoints <= 100) {
            bonusPoints += 5;
        } else if (startingPoints <= 1000) {
            bonusPoints = bonusPoints + (startingPoints * 0.20);
        } else {
            bonusPoints = bonusPoints + (startingPoints * 0.10);
        }

        System.out.println(bonusPoints);
        System.out.println(bonusPoints + startingPoints);
    }
}