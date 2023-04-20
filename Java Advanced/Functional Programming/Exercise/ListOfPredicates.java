package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfPredicates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        BiFunction<List<Integer>, Integer, Boolean> isDivisible = (list, number) -> {
            for (Integer integer : list) {
                if (number % integer != 0) {
                    return false;
                }
            }

            return true;
        };

        for (int i = 1; i <= n; i++) {
            if (isDivisible.apply(sequence, i)) {
                System.out.print(i + " ");
            }
        }
    }
}