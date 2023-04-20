package JavaAdvanced.IteratorsAndComparators.Exercise.ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ListyIterator listyIterator = null;

        while (!input.equals("END")) {
            String[] commandParts = input.split("\\s+");
            String command = commandParts[0];

            switch (command) {
                case "Create":
                    listyIterator = new ListyIterator(Arrays.copyOfRange(commandParts, 1, commandParts.length));
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
            }

            input = scanner.nextLine();
        }
    }
}