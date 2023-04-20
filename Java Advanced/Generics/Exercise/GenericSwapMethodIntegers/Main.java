package JavaAdvanced.Generics.Exercise.GenericSwapMethodIntegers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        Box<Integer> box = new Box<>();

        while (numberOfInputs-- > 0) {
            int input = Integer.parseInt(scanner.nextLine());

            box.add(input);
        }

        int[] swap = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        box.swap(swap[0], swap[1]);

        System.out.println(box);
    }
}