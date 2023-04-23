package JavaOOP.Encapsulation.Exercises.PizzaCalories;

import java.util.List;

public class Topping {
    private String toppingType;
    private double weight;

    private List<String> toppingList = List.of("Meat", "Veggies", "Cheese", "Sauce");

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!toppingList.contains(toppingType)) {
            String message = String.format("Cannot place %s on top of your pizza.", toppingType);

            throw new IllegalArgumentException(message);
        }

        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            String message = String.format("%s weight should be in the range [1..50].", this.toppingType);

            throw new IllegalArgumentException(message);
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        double toppingCalories = ToppingsModifiers.valueOf(this.toppingType.toUpperCase()).getModifier();

        return 2 * this.weight * toppingCalories;
    }
}