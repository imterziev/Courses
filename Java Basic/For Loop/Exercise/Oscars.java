package ProgrammingBasic.ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameOfActor = scanner.nextLine();
        double startingPoints = Double.parseDouble(scanner.nextLine());
        int judge = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < judge; i++) {

            String nameOfJudge = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            int lengthName = nameOfJudge.length();

            startingPoints = startingPoints + ((lengthName * judgePoints) / 2);

            if (startingPoints >= 1250.5) {
                break;
            }
        }

        double pointsDifference = Math.abs(startingPoints - 1250.5);

        if (startingPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActor, startingPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, pointsDifference);
        }
    }
}