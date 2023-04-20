package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> countNumbers = new LinkedHashMap<>();

        for (Double number : numbers) {
            countNumbers.putIfAbsent(number, 0);
            countNumbers.put(number, countNumbers.get(number) + 1);
        }

        countNumbers.entrySet()
                .forEach(e -> System.out.printf("%.1f -> %d\n", e.getKey(), e.getValue()));
    }
}