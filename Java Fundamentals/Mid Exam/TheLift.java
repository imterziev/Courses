package ProgrammingFundamentals.MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleInQueue = Integer.parseInt(scanner.nextLine());

        int[] wagons = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        boolean isPeopleInQueue = true;
        boolean isHaveEmptySpots = false;
        int lastIndex = 0;

        for (int i = 0; i < wagons.length; i++) {
            if (peopleInQueue <= 0) {
                lastIndex = i;
                isPeopleInQueue = false;
                break;
            }

            if (wagons[i] < 4) {
                wagons[i]++;
                peopleInQueue--;
                i--;
            }
        }

        for (int i = lastIndex; i < wagons.length; i++) {
            if (wagons[i] < 4) {
                isHaveEmptySpots = true;
            }
        }

        if (!isPeopleInQueue && isHaveEmptySpots) {
            System.out.println("The lift has empty spots!");
        } else if (isPeopleInQueue && !isHaveEmptySpots) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleInQueue);
        }

        Arrays.stream(wagons).forEach(wagon -> System.out.print(wagon + " "));
    }
}