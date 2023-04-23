package JavaAdvanced.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int elementsToOffer = input[0];
        int elementsToPoll = input[1];
        int elementToCheck = input[2];

        Deque<Integer> numbersQueue = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < elementsToOffer; i++) {
            numbersQueue.offer(numbers[i]);
        }

        for (int i = 1; i <= elementsToPoll; i++) {
            numbersQueue.poll();
        }

        if (numbersQueue.contains(elementToCheck)) {
            System.out.println(true);
        } else {
            int smallestNumber = Integer.MAX_VALUE;

            if (numbersQueue.isEmpty()) {
                smallestNumber = 0;
            } else {
                for (int currentNumber : numbers) {
                    if (smallestNumber > currentNumber) {
                        smallestNumber = currentNumber;
                    }
                }
            }

            System.out.println(smallestNumber);
        }
    }
}