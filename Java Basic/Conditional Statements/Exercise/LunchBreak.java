package ProgrammingBasic.ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameSerial = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double durationLunch = durationBreak / 8.00;
        double durationRelax = durationBreak / 4.00;

        double durationBreakLeft = durationBreak - durationLunch - durationRelax;
        double timeForEpisode = Math.ceil(Math.abs(durationBreakLeft - durationEpisode));

        if (durationBreakLeft >= durationEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSerial, timeForEpisode);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSerial, timeForEpisode);
        }
    }
}