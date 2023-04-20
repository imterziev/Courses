package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Function<String[], Integer> countIntegers = str -> str.length;

        Function<String[], Integer> sumIntegers = str ->
                Arrays.stream(str)
                        .mapToInt(Integer::parseInt)
                        .sum();

        Consumer<Integer> printCount = num -> System.out.println("Count = " + num);
        Consumer<Integer> printSum = num -> System.out.println("Sum = " + num);

        printCount.accept(countIntegers.apply(input));
        printSum.accept(sumIntegers.apply(input));
    }
}