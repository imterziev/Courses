package ProgrammingFundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class SoftUniParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> parking = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            switch (input[0]) {
                case "register":
                    if (parking.containsKey(input[1])) {
                        System.out.printf("ERROR: already registered with plate number %s%n", parking.get(input[1]).get(0));
                    } else {
                        parking.putIfAbsent(input[1], new ArrayList<>());
                        parking.get(input[1]).add(input[2]);

                        System.out.printf("%s registered %s successfully%n", input[1], input[2]);
                    }
                    break;
                case "unregister":
                    if (!parking.containsKey(input[1])) {
                        System.out.printf("ERROR: user %s not found%n", input[1]);
                    } else {
                        parking.remove(input[1]);

                        System.out.printf("%s unregistered successfully%n", input[1]);
                    }
                    break;
            }
        }

        for (Map.Entry<String, List<String>> entry : parking.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue().get(0));
        }
    }
}