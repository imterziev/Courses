package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String condition = scanner.nextLine();

        printNumbers(range[0], range[1],
                condition.equals("even")
                        ? n -> n % 2 == 0
                        : n -> n % 2 != 0);

    }

    private static void printNumbers(int startInclusive, int endInclusive, Predicate<Integer> predicate) {
        System.out.println(IntStream.rangeClosed(startInclusive, endInclusive)
                .boxed()
                .filter(predicate)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}