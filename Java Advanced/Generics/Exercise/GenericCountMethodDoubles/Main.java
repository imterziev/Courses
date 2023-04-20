package JavaAdvanced.Generics.Exercise.GenericCountMethodDoubles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        Box<Double> box = new Box<>();

        while (numberOfInputs-- > 0) {
            double input = Double.parseDouble(scanner.nextLine());

            box.add(input);
        }

        double element = Double.parseDouble(scanner.nextLine());

        System.out.println(box.countGreaterElement(element));
    }
}