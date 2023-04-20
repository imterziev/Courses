package JavaAdvanced.DefiningClasses.Lab.CarConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");

            Car car;

            if (data.length == 1) {
                car = new Car(data[0]);
            } else {
                car = new Car(data[0], data[1], Integer.parseInt(data[2]));
            }

            cars.add(car);
        }

        cars.forEach(System.out::println);
    }
}