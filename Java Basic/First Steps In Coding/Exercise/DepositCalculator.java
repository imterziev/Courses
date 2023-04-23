package ProgrammingBasic.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int periodOfDeposit = Integer.parseInt(scanner.nextLine());
        double yearPercentage = Double.parseDouble(scanner.nextLine());

        double sum = depositSum + periodOfDeposit * ((depositSum * (yearPercentage / 100)) / 12);

        System.out.println(sum);
    }
}