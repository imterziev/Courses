package ProgrammingBasic.PreExam;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysOfWorkout = Integer.parseInt(scanner.nextLine());
        double kilometersForDay = Double.parseDouble(scanner.nextLine());

        double kilometersNextDay = kilometersForDay;
        double totalKilometers = kilometersForDay;

        for (int i = 0; i < daysOfWorkout; i++) {

            int percentageForDay = Integer.parseInt(scanner.nextLine());

            kilometersNextDay = kilometersNextDay + (kilometersNextDay * percentageForDay / 100);

            totalKilometers += kilometersNextDay;
        }

        double difference = Math.ceil(Math.abs(1000 - totalKilometers));

        if (totalKilometers >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", difference);
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", difference);
        }
    }
}