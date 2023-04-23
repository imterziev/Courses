package JavaAdvanced.StacksAndQueues.Exercise;

import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int elementsToPush = scanner.nextInt();
        int elementsToPop = scanner.nextInt();
        int elementToCheck = scanner.nextInt();

        Deque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 1; i <= elementsToPush; i++) {
            numbersStack.push(scanner.nextInt());
        }

        for (int i = 1; i <= elementsToPop; i++) {
            numbersStack.pop();
        }

        if (numbersStack.contains(elementToCheck)) {
            System.out.println("true");
        } else {
            if (numbersStack.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(numbersStack));
            }
        }
    }
}