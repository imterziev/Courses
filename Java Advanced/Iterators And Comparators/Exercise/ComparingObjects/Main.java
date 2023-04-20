package JavaAdvanced.IteratorsAndComparators.Exercise.ComparingObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] personData = input.split("\\s+");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);
            String town = personData[2];

            Person person = new Person(name, age, town);

            personList.add(person);

            input = scanner.nextLine();
        }

        int personToCompare = Integer.parseInt(scanner.nextLine()) - 1;

        int equalToPerson = 0;
        int notEqualToPerson = 0;

        for (Person person : personList) {
            int compare = person.compareTo(personList.get(personToCompare));

            if (compare == 0) {
                equalToPerson++;
            } else {
                notEqualToPerson++;
            }
        }

        if (equalToPerson == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", equalToPerson, notEqualToPerson, personList.size());
        }
    }
}