package JavaAdvanced.StacksAndQueues.Exercise;

import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());

        Deque<Integer> sequenceStack = new ArrayDeque<>();

        for (int i = 1; i <= commands; i++) {
            String input = scanner.nextLine();

            switch (input) {
                case "2":
                    sequenceStack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(sequenceStack));
                    break;
                default:
                    int numberToPush = Integer.parseInt(input.split("\\s+")[1]);
                    sequenceStack.push(numberToPush);
                    break;
            }
        }
    }
}