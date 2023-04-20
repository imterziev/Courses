package ProgrammingFundamentals.Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int minSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSize; i++) {
            System.out.printf("%d %d ", firstList.get(i), secondList.get(i));
        }

        printRest(firstList, minSize);
        printRest(secondList, minSize);
    }

    private static void printRest(List<Integer> list, int minSize) {
        for (int i = minSize; i < list.size(); i++) {
            System.out.printf("%d ", list.get(i));
        }
    }
}