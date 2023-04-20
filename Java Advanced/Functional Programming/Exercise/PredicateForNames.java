package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> validLength = str -> str.length() <= length;

        Arrays.stream(names)
                .filter(validLength)
                .forEach(System.out::println);
    }
}