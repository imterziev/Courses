package JavaAdvanced.DefiningClasses.Exercise.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfEngines = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engines = new HashMap<>();

        while (numberOfEngines-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int power = Integer.parseInt(input[1]);

            Engine engine = null;

            if (input.length == 2) {
                engine = new Engine(model, power);
            } else if (input.length == 4) {
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];

                engine = new Engine(model, power, displacement, efficiency);
            } else if (input.length == 3) {
                try {
                    int displacement = Integer.parseInt(input[2]);

                    engine = new Engine(model, power, displacement);
                } catch (NumberFormatException e) {
                    String efficiency = input[2];

                    engine = new Engine(model, power, efficiency);
                }
            }

            engines.put(model, engine);
        }

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        while (numberOfCars-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            String engineModel = input[1];
            Engine engine = engines.get(engineModel);

            Car car = null;

            if (input.length == 2) {
                car = new Car(model, engine);
            } else if (input.length == 4) {
                int weight = Integer.parseInt(input[2]);
                String color = input[3];

                car = new Car(model, engine, weight, color);
            } else if (input.length == 3) {
                try {
                    int weight = Integer.parseInt(input[2]);

                    car = new Car(model, engine, weight);
                } catch (NumberFormatException e) {
                    String color = input[2];

                    car = new Car(model, engine, color);
                }
            }

            cars.add(car);
        }

        cars.forEach(System.out::println);
    }
}