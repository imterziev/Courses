package ProgrammingFundamentals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> trashMaterials = new LinkedHashMap<>();

        String obtained = "";
        boolean isObtained = false;

        while (!isObtained) {
            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length - 1; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String item = input[i + 1].toLowerCase();

                if (item.equals("shards") || item.equals("fragments") || item.equals("motes")) {
                    materials.putIfAbsent(item, 0);
                    materials.put(item, materials.get(item) + quantity);
                } else {
                    trashMaterials.putIfAbsent(item, 0);
                    trashMaterials.put(item, trashMaterials.get(item) + quantity);
                }

                if (materials.get("shards") >= 250) {
                    obtained = "Shadowmourne";
                    materials.put("shards", materials.get("shards") - 250);
                    isObtained = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    obtained = "Valanyr";
                    materials.put("fragments", materials.get("fragments") - 250);
                    isObtained = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    obtained = "Dragonwrath";
                    materials.put("motes", materials.get("motes") - 250);
                    isObtained = true;
                    break;
                }
            }
        }

        System.out.println(obtained + " obtained!");

        materials.entrySet().stream()
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        trashMaterials.entrySet().stream()
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

    }
}