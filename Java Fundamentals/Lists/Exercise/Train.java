package ProgrammingFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int maxSize = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            manipulateWagons(wagons, input, maxSize);

            input = scanner.nextLine();
        }

        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void manipulateWagons(List<Integer> wagons, String input, int maxSize) {
        String[] commands = input.split(" ");

        if (commands.length == 2) {
            wagons.add(Integer.parseInt(commands[1]));
        } else {
            for (int i = 0; i < wagons.size(); i++) {
                if (wagons.get(i) + Integer.parseInt(input) <= maxSize) {
                    wagons.set(i, wagons.get(i) + Integer.parseInt(input));
                    break;
                }
            }
        }
    }
}