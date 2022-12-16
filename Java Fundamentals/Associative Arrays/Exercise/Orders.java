package ProgrammingFundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Double>> products = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] inputArr = input.split("\\s+");
            String product = inputArr[0];
            String price = inputArr[1];
            String quantity = inputArr[2];

            products.putIfAbsent(product, new ArrayList<>());
            if (products.get(product).isEmpty()) {
                products.get(product).add(0, Double.parseDouble(price));
                products.get(product).add(1, Double.parseDouble(quantity));
            } else {
                products.get(product).set(0, Double.parseDouble(price));
                products.get(product).set(1, products.get(product).get(1) + Double.parseDouble(quantity));
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : products.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
        }
    }
}