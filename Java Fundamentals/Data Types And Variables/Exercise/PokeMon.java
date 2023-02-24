package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustion = Integer.parseInt(scanner.nextLine());

        int targets = 0;
        int powerRemain = pokePower;

        while (powerRemain >= distance) {
            powerRemain -= distance;
            targets++;

            if (powerRemain == (double) pokePower / 2 && exhaustion != 0) {
                powerRemain /= exhaustion;
            }
        }

        System.out.println(powerRemain);
        System.out.println(targets);
    }
}