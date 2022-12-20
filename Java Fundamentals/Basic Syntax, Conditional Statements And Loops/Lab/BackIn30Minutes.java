package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hours * 60) + minutes + 30;

        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        if (newHours == 24) {
            newHours = 0;
        }

        System.out.printf("%d:%02d", newHours, newMinutes);
    }
}