package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsOfHonor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Consumer<String> printer = n -> System.out.printf("Sir %s\n", n);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        names.stream().forEach(printer);
    }
}