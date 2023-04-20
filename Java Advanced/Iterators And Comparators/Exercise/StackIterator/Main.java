package JavaAdvanced.IteratorsAndComparators.Exercise.StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StackIterator stack = new StackIterator();

        while (!input.equals("END")) {
            String[] commandParts = input.split(",*\\s+");
            String command = commandParts[0];

            switch (command) {
                case "Push":
                    int[] numbers = Arrays.stream(commandParts).skip(1).mapToInt(Integer::parseInt).toArray();
                    stack.push(Arrays.copyOf(numbers, numbers.length));
                    break;
                case "Pop":
                    stack.pop();
                    break;
            }

            input = scanner.nextLine();
        }

        for (Integer integer : stack) {
            System.out.println(integer);
        }

        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }
}