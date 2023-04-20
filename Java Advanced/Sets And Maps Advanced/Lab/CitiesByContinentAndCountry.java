package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String continent = data[0];
            String country = data[1];
            String city = data[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());
            continents.get(continent).putIfAbsent(country, new LinkedList<>());
            continents.get(continent).get(country).add(city);
        }

        continents.entrySet().stream()
                .forEach(e -> {
                    System.out.println(e.getKey() + ":");

                    e.getValue().entrySet().stream()
                            .forEach(ie -> {
                                System.out.println("  " + ie.getKey() + " -> "
                                        + String.join(", ", ie.getValue()));
                            });
                });
    }
}