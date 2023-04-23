package ProgrammingBasic.ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int workingHours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (workingHours >= 10 && workingHours <= 18) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                case "Sunday":
                    System.out.println("closed");
                    break;
            }
        } else {
            System.out.println("closed");
        }
    }
}