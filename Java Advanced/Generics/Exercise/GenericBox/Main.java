package JavaAdvanced.Generics.Exercise.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberInputs = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();

        while (numberInputs-- > 0) {
            String input = scanner.nextLine();

            box.add(input);
        }

        System.out.println(box);
    }
}