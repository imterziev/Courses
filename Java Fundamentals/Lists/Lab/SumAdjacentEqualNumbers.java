package ProgrammingFundamentals.Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < input.size() - 1; i++) {
            double sum = 0;
            if (input.get(i).equals(input.get(i + 1))) {
                sum = input.get(i) + input.get(i + 1);
                input.set(i, sum);
                input.remove(i + 1);
                i = -1;
            }
        }

        for (double number : input) {
            System.out.printf("%s ", new DecimalFormat("0.#").format(number));
        }
    }
}