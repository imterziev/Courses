package ProgrammingBasic.ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int totalPoints = startingPoints;
        int averagePoints = 0;
        double percentageWins = 0;

        for (int i = 0; i < tournaments; i++) {

            String place = scanner.nextLine();

            switch (place) {
                case "W":
                    totalPoints += 2000;
                    percentageWins++;
                    break;
                case "F":
                    totalPoints += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
            }
        }

        averagePoints = (totalPoints - startingPoints) / tournaments;
        percentageWins = percentageWins / tournaments * 100;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", percentageWins);
    }
}