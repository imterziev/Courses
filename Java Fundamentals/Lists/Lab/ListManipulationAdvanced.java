package ProgrammingFundamentals.Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            manipulatingList(input, numbers);

            input = scanner.nextLine();
        }
    }

    private static void manipulatingList(String input, List<Integer> numbers) {
        List<String> command = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());

        switch (command.get(0)) {
            case "Contains":
                if (numbers.contains(Integer.parseInt(command.get(1)))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
                break;
            case "Print":
                if (command.get(1).equals("even")) {
                    getEven(numbers);
                } else {
                    getOdd(numbers);
                }
                break;
            case "Get":
                getSum(numbers);
                break;
            case "Filter":
                getFiltered(command.get(1), Integer.parseInt(command.get(2)), numbers);
                break;
        }
    }

    private static void getEven(List<Integer> numbers) {
        for (int evenNumbers : numbers) {
            if (evenNumbers % 2 == 0) {
                System.out.print(evenNumbers + " ");
            }
        }
        System.out.println();
    }

    private static void getOdd(List<Integer> numbers) {
        for (int evenNumbers : numbers) {
            if (evenNumbers % 2 != 0) {
                System.out.print(evenNumbers + " ");
            }
        }
        System.out.println();
    }

    private static void getSum(List<Integer> numbers) {
        int sum = 0;

        for (int currentNumber : numbers) {
            sum += currentNumber;
        }

        System.out.println(sum);
    }

    private static void getFiltered(String operator, int givenNumber, List<Integer> numbers) {
        switch (operator) {
            case "<":
                for (int currentNumber : numbers) {
                    if (currentNumber < givenNumber) {
                        System.out.print(currentNumber + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int currentNumber : numbers) {
                    if (currentNumber <= givenNumber) {
                        System.out.print(currentNumber + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (int currentNumber : numbers) {
                    if (currentNumber > givenNumber) {
                        System.out.print(currentNumber + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int currentNumber : numbers) {
                    if (currentNumber >= givenNumber) {
                        System.out.print(currentNumber + " ");
                    }
                }
                System.out.println();
                break;
        }
    }
}