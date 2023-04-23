package JavaOOP.InterfacesAndAbstraction.Lab.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> identifiables = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            Identifiable identifiable = tokens.length == 2
                    ? new Robot(tokens[0], tokens[1])
                    : new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);


            identifiables.add(identifiable);

            input = scanner.nextLine();
        }

        String fakeId = scanner.nextLine();

        System.out.println(identifiables.stream()
                .map(Identifiable::getId)
                .filter(id -> id.endsWith(fakeId))
                .collect(Collectors.joining(System.lineSeparator())));
    }
}