package ProgrammingBasic.PreExam;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lager = scanner.nextLine();
        int metersDay = 0;

        int totalMeters = 5364;
        int countDays = 1;

        while (!lager.equals("END")) {
            metersDay = Integer.parseInt(scanner.nextLine());

            if (lager.equals("Yes")) {
                countDays++;
            }

            if (countDays > 5) {
                break;
            }

            totalMeters += metersDay;

            if (totalMeters >= 8848) {
                break;
            }

            lager = scanner.nextLine();
        }

        if (totalMeters >= 8848) {
            System.out.printf("Goal reached for %d days!", countDays);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", totalMeters);
        }
    }
}