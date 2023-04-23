package JavaAdvanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> expressionsStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(expressionsStack::offer);

        while (expressionsStack.size() > 1) {
            int first = Integer.parseInt(expressionsStack.pop());
            String operator = expressionsStack.pop();
            int second = Integer.parseInt(expressionsStack.pop());

            if (operator.equals("+")) {
                expressionsStack.push(String.valueOf(first + second));
            } else {
                expressionsStack.push(String.valueOf(first - second));
            }
        }

        System.out.println(expressionsStack.pop());
    }
}