package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] lengths = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int firstLength = lengths[0];
        int secondLength = lengths[1];

        Set<Integer> firstNumbers = new LinkedHashSet<>();
        Set<Integer> secondNumbers = new LinkedHashSet<>();

        while (firstLength-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            firstNumbers.add(number);
        }

        while (secondLength-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            secondNumbers.add(number);
        }

        firstNumbers.retainAll(secondNumbers);

        firstNumbers.stream().forEach(e -> System.out.print(e + " "));
    }
}