package JavaAdvanced.DefiningClasses.Exercise.CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine, weight, "n/a");
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine, 0, color);
    }

    public Car(String model, Engine engine) {
        this(model, engine, 0, "n/a");
    }


    @Override
    public String toString() {
        String printWeight;

        if (weight == 0) {
            printWeight = "n/a";
        } else {
            printWeight = weight + "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(model).append(":").append("\n")
                .append(engine.toString()).append("\n")
                .append("Weight: ").append(printWeight).append("\n")
                .append("Color: ").append(color);

        return stringBuilder.toString();
    }
}