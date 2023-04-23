package ProgrammingBasic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minutesOfExam = Integer.parseInt(scanner.nextLine());
        int hourOnDestination = Integer.parseInt(scanner.nextLine());
        int minutesOnDestination = Integer.parseInt(scanner.nextLine());

        int totalTimeExam = (hourOfExam * 60) + minutesOfExam;
        int totalTimeDestination = (hourOnDestination * 60) + minutesOnDestination;

        int timeDifferent = Math.abs(totalTimeExam - totalTimeDestination);

        int totalHoursTimeDifferent = timeDifferent / 60;
        int totalMinutesTimeDifferent = timeDifferent % 60;

        if (totalTimeExam < totalTimeDestination) {
            System.out.println("Late");

            if (timeDifferent < 60) {
                System.out.printf("%d minutes after the start", timeDifferent);
            } else {
                System.out.printf("%d:%02d hours after the start", totalHoursTimeDifferent, totalMinutesTimeDifferent);
            }
        } else if (totalTimeExam == totalTimeDestination || timeDifferent <= 30) {
            System.out.println("On time");

            if (timeDifferent != 0) {

                if (timeDifferent < 60) {
                    System.out.printf("%d minutes before the start", timeDifferent);
                } else {
                    System.out.printf("%d:%02d hours before the start", totalHoursTimeDifferent, totalMinutesTimeDifferent);
                }
            }
        } else {
            System.out.println("Early");

            if (timeDifferent < 60) {
                System.out.printf("%d minutes before the start", timeDifferent);
            } else {
                System.out.printf("%d:%02d hours before the start", totalHoursTimeDifferent, totalMinutesTimeDifferent);
            }
        }
    }
}