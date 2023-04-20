package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countInputs = Integer.parseInt(scanner.nextLine());

        Set<String> uniqueUsernames = new LinkedHashSet<>();

        while (countInputs-- > 0) {
            uniqueUsernames.add(scanner.nextLine());
        }

        uniqueUsernames.stream().forEach(System.out::println);
    }
}