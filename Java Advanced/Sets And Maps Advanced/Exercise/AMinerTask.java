package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            resources.putIfAbsent(resource, 0);
            resources.put(resource, resources.get(resource) + quantity);

            resource = scanner.nextLine();
        }

        resources.entrySet().stream()
                .forEach(e -> System.out.printf("%s -> %d\n", e.getKey(), e.getValue()));
    }
}