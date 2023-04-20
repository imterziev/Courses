package ProgrammingFundamentals.Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(n -> n < 0);
        Collections.reverse(numbers);

        if (!numbers.isEmpty()) {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println("empty");
        }
    }
}