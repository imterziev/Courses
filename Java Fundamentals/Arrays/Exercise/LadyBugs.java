package ProgrammingFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[] field = new int[size];
        int[] ladyBugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int ladyBugsIndex : ladyBugs) {
            if (ladyBugsIndex >= 0 && ladyBugsIndex < field.length) {
                field[ladyBugsIndex] = 1;
            }
        }

        String move = scanner.nextLine();

        while (!move.equals("end")) {
            String[] command = move.split(" ");

            int index = Integer.parseInt(command[0]);
            String direction = command[1];
            int lengthFlying = Integer.parseInt(command[2]);

            if (index >= 0 && index <= field.length - 1 && field[index] == 1) {
                field[index] = 0;

                if (direction.equals("right")) {
                    index += lengthFlying;

                    while (index <= field.length - 1 && field[index] == 1) {
                        index += lengthFlying;
                    }

                    if (index <= field.length - 1) {
                        field[index] = 1;
                    }
                } else if (direction.equals("left")) {
                    index -= lengthFlying;

                    while (index >= 0 && field[index] == 1) {
                        index -= lengthFlying;
                    }

                    if (index >= 0) {
                        field[index] = 1;
                    }
                }
            }

            move = scanner.nextLine();
        }

        for (int number : field) {
            System.out.print(number + " ");
        }
    }
}