package JavaAdvanced.Generics.Exercise.GenericSwapMethodStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();

        while (numberOfInputs-- > 0) {
            String input = scanner.nextLine();

            box.add(input);
        }

        int[] swap = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        box.swap(swap[0], swap[1]);

        System.out.println(box);
    }
}