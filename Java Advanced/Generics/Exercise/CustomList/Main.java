package JavaAdvanced.Generics.Exercise.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        CustomList<String> list = new CustomList<>();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Add":
                    String addElement = tokens[1];
                    list.add(addElement);
                    break;
                case "Remove":
                    int index = Integer.parseInt(tokens[1]);
                    list.remove(index);
                    break;
                case "Contains":
                    String containsElement = tokens[1];
                    System.out.println(list.contains(containsElement));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    list.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String greaterElement = tokens[1];
                    System.out.println(list.countGreaterThan(greaterElement));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.print(list);
                    break;
            }

            input = scanner.nextLine();
        }
    }
}