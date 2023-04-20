package ProgrammingFundamentals.FinalExam;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder destinations = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] commands = input.split(":");
            String command = commands[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(commands[1]);
                    String addStop = commands[2];
                    if (index >= 0 && index < destinations.length()) {
                        destinations.insert(index, addStop);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]) + 1;
                    if (startIndex >= 0 && endIndex <= destinations.length()) {
                        destinations.delete(startIndex, endIndex);
                    }
                    break;
                case "Switch":
                    String oldDestination = commands[1];
                    String newDestination = commands[2];
                    String destinationsAsString = destinations.toString();
                    destinationsAsString = destinationsAsString.replace(oldDestination, newDestination);
                    destinations = new StringBuilder(destinationsAsString);
                    break;
            }

            System.out.println(destinations);

            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", destinations);
    }
}