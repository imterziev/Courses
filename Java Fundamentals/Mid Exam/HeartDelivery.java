package ProgrammingFundamentals.MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] houses = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        int jumpLength = 0;
        int lastHouse = 0;

        while (!input.equals("Love!")) {
            jumpLength = Integer.parseInt(input.split("\\s+")[1]);

            lastHouse += jumpLength;

            if (lastHouse >= houses.length) {
                lastHouse = 0;
            }

            if (houses[lastHouse] <= 0) {
                System.out.printf("Place %d already had Valentine's day.%n", lastHouse);
            } else {
                houses[lastHouse] -= 2;

                if (houses[lastHouse] <= 0) {
                    System.out.printf("Place %d has Valentine's day.%n", lastHouse);
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", lastHouse);

        boolean isSuccessful = true;
        int counter = 0;

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != 0) {
                isSuccessful = false;
                counter++;
            }
        }

        if (isSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", counter);
        }
    }
}