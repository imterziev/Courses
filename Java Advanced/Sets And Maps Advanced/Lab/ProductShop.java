package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Double>> shopsData = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] tokens = input.split(",\\s+");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            shopsData.putIfAbsent(shop, new LinkedHashMap<>());
            shopsData.get(shop).put(product, price);

            input = scanner.nextLine();
        }

        for (String shop : shopsData.keySet()) {
            System.out.println(shop + "->");

            for (var entry : shopsData.get(shop).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n", entry.getKey(), entry.getValue());
            }
        }
    }
}
