package ProgrammingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bomb = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < sequence.size(); i++) {
            if (sequence.get(i) == bomb.get(0)) {
                for (int j = 0; j < bomb.get(1); j++) {
                    if (sequence.size() > i + 1) {
                        sequence.remove(i + 1);
                    }
                }

                sequence.remove(i);

                for (int j = 0; j < bomb.get(1); j++) {
                    if (i - 1 - j >= 0) {
                        sequence.remove(i - 1 - j);
                    }
                }

                i--;
            }
        }

        int sum = 0;

        for (int number : sequence) {
            sum += number;
        }

        System.out.println(sum);
    }
}