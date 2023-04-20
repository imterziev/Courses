package JavaAdvanced.DefiningClasses.Exercise.RawData;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        while (countOfCars-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String carModel = input[0];

            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);

            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];

            Cargo cargo = new Cargo(cargoWeight, cargoType);

            double tyre1Pressure = Double.parseDouble(input[5]);
            int tyre1Age = Integer.parseInt(input[6]);
            double tyre2Pressure = Double.parseDouble(input[7]);
            int tyre2Age = Integer.parseInt(input[8]);
            double tyre3Pressure = Double.parseDouble(input[9]);
            int tyre3Age = Integer.parseInt(input[10]);
            double tyre4Pressure = Double.parseDouble(input[11]);
            int tyre4Age = Integer.parseInt(input[12]);

            Tires tires = new Tires(tyre1Pressure, tyre1Age, tyre2Pressure, tyre2Age, tyre3Pressure, tyre3Age, tyre4Pressure, tyre4Age);

            Car car = new Car(carModel, engine, cargo, tires);
            cars.add(car);
        }

        String input = scanner.nextLine();

        String cargoFilter = input.equals("fragile")
                ? "fragile"
                : "flamable";

        cars.stream()
                .filter(c -> c.getCargo().getType().equals(cargoFilter))
                .filter(filter(cargoFilter)).forEach(System.out::println);
    }

    private static Predicate<Car> filter(String cargoFilter) {
        return c -> {

            if (cargoFilter.equals("fragile")) {
                if (c.getTires().getTire1Pressure() < 1 || c.getTires().getTire2Pressure() < 1
                        || c.getTires().getTire3Pressure() < 1 || c.getTires().getTire4Pressure() < 1) {
                    return true;
                }

                return false;
            } else {
                if (c.getEngine().getPower() > 250) {
                    return true;
                }

                return false;
            }
        };
    }
}