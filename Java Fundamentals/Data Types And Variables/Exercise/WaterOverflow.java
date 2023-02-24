package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pours = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int sumLiters = 0;

        for (int i = 1; i <= pours; i++) {
            int pouredLiters = Integer.parseInt(scanner.nextLine());

            if (capacity < pouredLiters) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= pouredLiters;
                sumLiters += pouredLiters;
            }
        }

        System.out.println(sumLiters);
    }
}