package JavaAdvanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> kidsQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(kidsQueue::offer);

        int tosses = Integer.parseInt(scanner.nextLine());
        int cycle = 1;

        while (kidsQueue.size() > 1) {
            for (int i = 1; i < tosses; i++) {
                kidsQueue.offer(kidsQueue.poll());
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + kidsQueue.peek());
            } else {
                System.out.println("Removed " + kidsQueue.poll());
            }

            cycle++;
        }

        System.out.println("Last is " + kidsQueue.poll());
    }

    private static boolean isPrime(int cycle) {
        if (cycle <= 1) {
            return false;
        }

        for (int i = 2; i < cycle; i++) {
            if (cycle % i == 0) {
                return false;
            }
        }

        return true;
    }
}