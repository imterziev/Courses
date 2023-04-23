package JavaAdvanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> kidsQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(kidsQueue::offer);

        int tosses = Integer.parseInt(scanner.nextLine());

        while (kidsQueue.size() > 1) {
            for (int i = 1; i < tosses; i++) {
                kidsQueue.offer(kidsQueue.poll());
            }

            System.out.println("Removed " + kidsQueue.poll());
        }

        System.out.println("Last is " + kidsQueue.poll());
    }
}