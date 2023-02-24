package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int extractedSpice = 0;
        int days = 0;

        while (startingYield >= 100) {
            extractedSpice += startingYield;

            extractedSpice -= 26;

            startingYield -= 10;

            days++;
        }

        if (extractedSpice >= 26) {
            extractedSpice -= 26;
        }

        System.out.println(days);
        System.out.println(extractedSpice);
    }
}