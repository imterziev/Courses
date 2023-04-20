package JavaAdvanced.Generics.Exercise.CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        CustomList<String> list = new CustomList<>();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            String output = null;

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
                    output = String.valueOf(list.contains(containsElement));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    list.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String greaterElement = tokens[1];
                    output = String.valueOf(list.countGreaterThan(greaterElement));
                    break;
                case "Max":
                    output = list.getMax();
                    break;
                case "Min":
                    output = list.getMin();
                    break;
                case "Sort":
                    list.sort();
                    break;
                case "Print":
                    list.print();
                    break;
            }

            if (output != null) {
                System.out.println(output);
            }

            input = scanner.nextLine();
        }
    }
}