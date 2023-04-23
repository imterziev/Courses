package JavaAdvanced.FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class LootBox {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<Integer> firstBoxQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        Deque<Integer> secondBoxStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(secondBoxStack::push);

        int claimedItems = 0;

        while (!firstBoxQueue.isEmpty() && !secondBoxStack.isEmpty()) {
            int firstItem = firstBoxQueue.peek();
            int secondItem = secondBoxStack.pop();

            int sumItems = firstItem + secondItem;

            if (sumItems % 2 == 0) {
                firstBoxQueue.poll();
                claimedItems += sumItems;
            } else {
                firstBoxQueue.offer(secondItem);
            }
        }

        String outputBoxes = firstBoxQueue.isEmpty()
                ? "First lootbox is empty"
                : "Second lootbox is empty";

        System.out.println(outputBoxes);

        String outputLoot = claimedItems >= 100
                ? "Your loot was epic! Value: "
                : "Your loot was poor... Value: ";

        System.out.println(outputLoot + claimedItems);
    }
}