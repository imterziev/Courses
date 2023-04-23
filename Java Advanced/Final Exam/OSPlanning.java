package JavaAdvanced.FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class OSPlanning {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<Integer> tasksStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Integer::parseInt).forEach(tasksStack::push);

        Deque<Integer> threadsQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        int valueToKill = Integer.parseInt(scanner.nextLine());

        int threadValue = 0;
        int taskValue = 0;

        while (true) {
            threadValue = threadsQueue.peek();
            taskValue = tasksStack.peek();

            if (taskValue == valueToKill) {
                break;
            }

            if (taskValue <= threadValue) {
                tasksStack.pop();
            }

            threadsQueue.poll();
        }

        System.out.printf("Thread with value %d killed task %d\n", threadValue, taskValue);
        for (Integer thread : threadsQueue) {
            System.out.print(thread + " ");
        }
    }
}