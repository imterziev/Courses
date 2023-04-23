package JavaOOP.Encapsulation.Exercises.PizzaCalories;

import java.util.List;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    private List<String> flourList = List.of("White", "Wholegrain");
    private List<String> doughType = List.of("Crispy", "Chewy", "Homemade");

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!flourList.contains(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!doughType.contains(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 120) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        double flourCalories = DoughModifiers.valueOf(this.flourType.toUpperCase()).getModifier();
        double bakingCalories = DoughModifiers.valueOf(this.bakingTechnique.toUpperCase()).getModifier();

        return 2 * this.weight * flourCalories * bakingCalories;
    }
}