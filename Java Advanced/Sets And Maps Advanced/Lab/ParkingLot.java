package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> parkingLot = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(",\\s+");
            String command = tokens[0];
            String registration = tokens[1];

            if (command.equals("IN")) {
                parkingLot.add(registration);
            } else {
                parkingLot.remove(registration);
            }

            input = scanner.nextLine();
        }

        String output = parkingLot.isEmpty() ? "Parking Lot is Empty" : String.join(System.lineSeparator(), parkingLot);

        System.out.println(output);
    }
}