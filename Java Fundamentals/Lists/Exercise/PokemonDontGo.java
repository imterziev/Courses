package ProgrammingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (!sequence.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());

            int currentElement = 0;

            if (index < 0) {
                index = 0;
                currentElement = sequence.get(index);
                sequence.set(0, sequence.get(sequence.size() - 1));
            } else if (index >= sequence.size()) {
                index = sequence.size() - 1;
                currentElement = sequence.get(index);
                sequence.set(sequence.size() - 1, sequence.get(0));
            } else {
                currentElement = sequence.get(index);
                sequence.remove(index);
            }

            sum += currentElement;

            for (int i = 0; i < sequence.size(); i++) {
                if (currentElement >= sequence.get(i)) {
                    sequence.set(i, sequence.get(i) + currentElement);
                } else {
                    sequence.set(i, sequence.get(i) - currentElement);
                }
            }
        }

        System.out.println(sum);
    }
}