package JavaAdvanced.Generics.Exercise.GenericCountMethodStrings;

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

        String element = scanner.nextLine();

        System.out.println(box.countGreaterElement(element));
    }
}