package JavaAdvanced.DefiningClasses.Exercise.SpeedRacing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        while (numberOfCars-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelCost = Double.parseDouble(input[2]);

            Car car = new Car(model, fuelAmount, fuelCost);

            cars.put(model, car);
        }

        String[] drive = scanner.nextLine().split("\\s+");

        while (!drive[0].equals("End")) {
            String model = drive[1];
            double kilometerToDrive = Double.parseDouble(drive[2]);

            if (!cars.get(model).drive(kilometerToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }

            drive = scanner.nextLine().split("\\s+");
        }

        cars.values().forEach(System.out::println);
    }
}