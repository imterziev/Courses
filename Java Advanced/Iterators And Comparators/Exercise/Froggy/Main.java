package JavaAdvanced.IteratorsAndComparators.Exercise.Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> stones = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        Lake lake = new Lake(stones);

        List<String> output = new ArrayList<>();

        for (Integer stone : lake) {
            output.add(stone + "");
        }

        String input = scanner.nextLine();

        if (input.equals("END")) {
            System.out.println(String.join(", ", output));
        }
    }
}