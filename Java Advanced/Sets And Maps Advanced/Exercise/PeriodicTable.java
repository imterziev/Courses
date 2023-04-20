package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        Set<String> compounds = new TreeSet<>();

        while (counter-- > 0) {
            String[] elements = scanner.nextLine().split("\\s+");

            Arrays.stream(elements).forEach(e -> compounds.add(e));
        }

        System.out.println(String.join(" ", compounds));
    }
}