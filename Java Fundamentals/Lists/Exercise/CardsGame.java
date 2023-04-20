package ProgrammingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {
            int firstDeckFirstCard = firstDeck.get(0);
            int secondDeckFirstCard = secondDeck.get(0);

            firstDeck.remove(firstDeck.get(0));
            secondDeck.remove(secondDeck.get(0));

            if (firstDeckFirstCard > secondDeckFirstCard) {
                firstDeck.add(firstDeckFirstCard);
                firstDeck.add(secondDeckFirstCard);
            } else if (firstDeckFirstCard < secondDeckFirstCard) {
                secondDeck.add(secondDeckFirstCard);
                secondDeck.add(firstDeckFirstCard);
            }
        }

        int sum = 0;

        if (firstDeck.isEmpty() && secondDeck.isEmpty() || secondDeck.isEmpty()) {
            for (int numbers : firstDeck) {
                sum += numbers;
            }

            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int numbers : secondDeck) {
                sum += numbers;
            }

            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}