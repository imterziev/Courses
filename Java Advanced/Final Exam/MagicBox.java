package JavaAdvanced.FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class MagicBox {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<Integer> firstBoxQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        Deque<Integer> secondBoxStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(secondBoxStack::push);

        int claimedItems = 0;

        while (!firstBoxQueue.isEmpty() && !secondBoxStack.isEmpty()) {
            int firstItem = firstBoxQueue.peek();
            int secondItem = secondBoxStack.pop();

            int result = firstItem + secondItem;

            if (result % 2 == 0) {
                claimedItems += result;
                firstBoxQueue.poll();
            } else {
                firstBoxQueue.offer(secondItem);
            }
        }

        String whichBoxIsEmpty = firstBoxQueue.isEmpty()
                ? "First magic box is empty."
                : "Second magic box is empty.";

        String output = claimedItems >= 90
                ? "Wow, your prey was epic! Value: "
                : "Poor prey... Value: ";

        System.out.println(whichBoxIsEmpty);
        System.out.println(output + claimedItems);
    }
}