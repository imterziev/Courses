package JavaAdvanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> backHistoryStack = new ArrayDeque<>();
        ArrayDeque<String> forwardHistoryQueue = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (backHistoryStack.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    forwardHistoryQueue.addFirst(backHistoryStack.pop());
                    System.out.println(backHistoryStack.peek());
                }
            } else if (input.equals("forward")) {
                if (forwardHistoryQueue.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    backHistoryStack.push(forwardHistoryQueue.poll());
                    System.out.println(backHistoryStack.peek());
                }
            } else {
                if (!input.equals("")) {
                    backHistoryStack.push(input);
                    System.out.println(input);
                    forwardHistoryQueue.clear();
                }
            }

            input = scanner.nextLine();
        }
    }
}