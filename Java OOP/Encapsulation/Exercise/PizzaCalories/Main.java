package JavaOOP.Encapsulation.Exercises.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            String[] inputPizza = getSplit(input);
            String name = inputPizza[1];
            int numberOfToppings = Integer.parseInt(inputPizza[2]);

            Pizza pizza = new Pizza(name, numberOfToppings);

            input = scanner.nextLine();

            String[] inputDough = getSplit(input);
            String flourType = inputDough[1];
            String bakingTechnique = inputDough[2];
            double weight = Double.parseDouble(inputDough[3]);

            Dough dough = new Dough(flourType, bakingTechnique, weight);

            pizza.setDough(dough);

            input = scanner.nextLine();

            while (!input.equals("END")) {
                String[] inputTopping = getSplit(input);

                String toppingType = inputTopping[1];
                double weightTopping = Double.parseDouble(inputTopping[2]);

                Topping topping = new Topping(toppingType, weightTopping);

                pizza.addTopping(topping);

                input = scanner.nextLine();
            }

            System.out.println(pizza);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String[] getSplit(String str) {
        return str.split("\\s+");
    }
}