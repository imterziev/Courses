package ProgrammingFundamentals.Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 1; i <= commands; i++) {
            List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

            if (names.size() == 0 && !input.get(2).equals("not")) {
                names.add(input.get(0));
                continue;
            } else if (names.size() == 0 && input.get(2).equals("not")) {
                System.out.printf("%s is not in the list!%n", input.get(0));
                continue;
            }

            if (input.get(2).equals("going!")) {
                for (int j = 0; j < names.size(); j++) {
                    if (input.get(0).equals(names.get(j))) {
                        System.out.printf("%s is already in the list!%n", input.get(0));
                        break;
                    } else {
                        if (j == names.size() - 1) {
                            names.add(input.get(0));
                            break;
                        }
                    }
                }
            } else {
                for (int j = 0; j < names.size(); j++) {
                    if (input.get(0).equals(names.get(j))) {
                        names.remove(input.get(0));
                        break;
                    } else {
                        if (j == names.size() - 1) {
                            System.out.printf("%s is not in the list!%n", input.get(0));
                        }
                    }
                }
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}