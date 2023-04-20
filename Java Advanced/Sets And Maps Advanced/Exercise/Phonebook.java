package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String addNumber = scanner.nextLine();

        while (!addNumber.equals("search")) {
            String[] contact = addNumber.split("-");
            String name = contact[0];
            String number = contact[1];

            phonebook.put(name, number);

            addNumber = scanner.nextLine();
        }

        String search = scanner.nextLine();

        while (!search.equals("stop")) {
            if (phonebook.containsKey(search)) {
                System.out.printf("%s -> %s\n", search, phonebook.get(search));
            } else {
                System.out.printf("Contact %s does not exist.\n", search);
            }

            search = scanner.nextLine();
        }
    }
}