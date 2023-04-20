package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        Function<int[], int[]> add = arr -> Arrays.stream(arr)
                .map(e -> e += 1).toArray();

        Function<int[], int[]> multiply = arr -> Arrays.stream(arr)
                .map(e -> e *= 2).toArray();

        Function<int[], int[]> subtract = arr -> Arrays.stream(arr)
                .map(e -> e -= 1).toArray();

        Consumer<int[]> printArr = e -> {
            Arrays.stream(e).forEach(i -> System.out.print(i + " "));
            System.out.println();
        };

        while (!input.equals("end")) {
            switch (input) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    printArr.accept(numbers);
                    break;
            }

            input = scanner.nextLine();
        }
    }
}