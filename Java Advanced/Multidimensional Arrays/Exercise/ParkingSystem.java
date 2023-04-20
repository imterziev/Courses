package JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.Map;
import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        boolean[][] parkingLot = new boolean[rows][cols];

        fillParkingLot(parkingLot);

        String input = scanner.nextLine();
        ;

        while (!input.equals("stop")) {
            String[] parkingData = input.split("\\s+");
            int entryRow = Integer.parseInt(parkingData[0]);
            int targetRow = Integer.parseInt(parkingData[1]);
            int targetCol = Integer.parseInt(parkingData[2]);

            boolean foundFreePlace = false;

            int distance = 1;

            distance += Math.abs(targetRow - entryRow);

            if (!parkingLot[targetRow][targetCol]) {
                distance += targetCol;
                parkingLot[targetRow][targetCol] = true;
                foundFreePlace = true;
            } else {
                for (int i = 1; i < parkingLot[targetRow].length; i++) {
                    if (targetCol - i > 0 && !parkingLot[targetRow][targetCol - i]) {
                        distance += targetCol - i;
                        parkingLot[targetRow][targetCol - i] = true;
                        foundFreePlace = true;
                        break;
                    }

                    if (targetCol + i < parkingLot[targetRow].length && !parkingLot[targetRow][targetCol + i]) {
                        distance += targetCol + i;
                        parkingLot[targetRow][targetCol + i] = true;
                        foundFreePlace = true;
                        break;
                    }
                }
            }

            if (foundFreePlace) {
                System.out.println(distance);
            } else {
                System.out.println(String.format("Row %d full", targetRow));
            }

            input = scanner.nextLine();
        }
    }

    private static void fillParkingLot(boolean[][] parkingLot) {
        for (int row = 0; row < parkingLot.length; row++) {
            parkingLot[row][0] = true;
        }
    }
}