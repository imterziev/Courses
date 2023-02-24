package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int snowballs = Integer.parseInt(scanner.nextLine());

        double highestValue = 0;
        int snowballSnowOut = 0;
        int snowballTimeOut = 0;
        int snowballQualityOut = 0;

        for (int i = 1; i <= snowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (highestValue < snowballValue) {
                highestValue = snowballValue;
                snowballSnowOut = snowballSnow;
                snowballTimeOut = snowballTime;
                snowballQualityOut = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", snowballSnowOut, snowballTimeOut, highestValue, snowballQualityOut);
    }
}