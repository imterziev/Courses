package JavaAdvanced.FinalExam.CarDealership;

import java.util.ArrayList;
import java.util.Collection;

public class Dealership {
    public String name;
    public int capacity;

    public Collection<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.capacity > this.data.size()) {
            this.data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        return data.remove(returnCar(manufacturer, model));
    }

    public Car getLatestCar() {
        Car car = null;

        int latestYear = Integer.MIN_VALUE;

        for (Car carData : data) {
            if (carData.getYear() > latestYear) {
                car = carData;
                latestYear = carData.getYear();
            }
        }

        return car;
    }

    public Car getCar(String manufacturer, String model) {
        return returnCar(manufacturer, model);
    }

    private Car returnCar(String manufacturer, String model) {
        Car car = null;

        for (Car carData : data) {
            if (carData.getManufacturer().equals(manufacturer) && carData.getModel().equals(model)) {
                car = carData;
            }
        }

        return car;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("The cars are in a car dealership ").append(this.name).append(":\n");

        for (Car carData : data) {
            stringBuilder.append(carData).append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}