package JavaAdvanced.DefiningClasses.Exercise.CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power, displacement, "n/a");
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power, 0, efficiency);
    }

    public Engine(String model, int power) {
        this(model, power, 0, "n/a");
    }

    @Override
    public String toString() {
        String printDisplacement;

        if (displacement == 0) {
            printDisplacement = "n/a";
        } else {
            printDisplacement = displacement + "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(model).append(":").append("\n")
                .append("Power: ").append(power).append("\n")
                .append("Displacement: ").append(printDisplacement).append("\n")
                .append("Efficiency: ").append(efficiency);

        return stringBuilder.toString();
    }
}