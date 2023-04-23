package JavaAdvanced.StacksAndQueues.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PoisonousPlants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        List<Integer> pesticide = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int lastDay = 0;

        for (int i = 1; i <= days; i++) {
            for (int j = pesticide.size() - 1; j > 0; j--) {
                if (pesticide.get(j) > pesticide.get(j - 1)) {
                    pesticide.remove(j);
                    lastDay = i;
                }
            }
        }

        System.out.println(lastDay);
    }
}