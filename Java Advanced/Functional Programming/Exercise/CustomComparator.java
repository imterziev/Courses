package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        Comparator<Integer> comparator = (n1, n2) -> {
            if (n1 % 2 == 0 && n2 % 2 != 0) {
                return -1;
            } else if (n1 % 2 != 0 && n2 % 2 == 0) {
                return 1;
            }

            return n1.compareTo(n2);
        };

        numbers.stream().sorted(comparator).forEach(e -> System.out.print(e + " "));
    }
}