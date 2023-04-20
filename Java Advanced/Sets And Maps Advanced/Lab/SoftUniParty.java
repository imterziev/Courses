package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {
            guests.add(input);

            input = scanner.nextLine();
        }

        String guest = scanner.nextLine();

        while (!guest.equals("END")) {
            guests.remove(guest);

            guest = scanner.nextLine();
        }

        System.out.println(guests.size());
        System.out.println(String.join(System.lineSeparator(), guests));
    }
}