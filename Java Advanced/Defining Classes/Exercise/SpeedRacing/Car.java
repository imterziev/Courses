package JavaAdvanced.DefiningClasses.Exercise.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        distanceTraveled = 0;
    }

    public boolean drive(double kilometersToDrive) {
        double fuelNeeded = kilometersToDrive * fuelCost;

        if (fuelNeeded > fuelAmount) {
            return false;
        } else {
            fuelAmount -= fuelNeeded;
            distanceTraveled += kilometersToDrive;

            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, distanceTraveled);
    }
}