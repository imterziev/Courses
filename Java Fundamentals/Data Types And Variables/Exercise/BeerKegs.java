package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersOfKegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = 0;
        String biggestKeg = "";

        for (int i = 1; i <= numbersOfKegs; i++) {
            String modelOfKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (maxVolume < volume) {
                maxVolume = volume;

                biggestKeg = modelOfKeg;
            }
        }

        System.out.println(biggestKeg);
    }
}