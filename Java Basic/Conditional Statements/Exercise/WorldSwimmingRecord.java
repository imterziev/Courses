package ProgrammingBasic.ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());

        double slowingTime = Math.floor(distance / 15) * 12.5;
        double swimmingTime = (distance * timeForMeter) + slowingTime;

        if (record > swimmingTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimmingTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", swimmingTime - record);
        }
    }
}