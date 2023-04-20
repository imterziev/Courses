package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int divider = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> checkDivision = e -> e % divider != 0;
        Consumer<Integer> print = i -> System.out.print(i + " ");

        Collections.reverse(numbers);

        numbers.stream()
                .filter(checkDivision)
                .forEach(print);
    }
}