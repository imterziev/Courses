package JavaAdvanced.IteratorsAndComparators.Exercise.StrategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Person> personNameSet = new TreeSet<>(new NameLengthComparator());
        Set<Person> personAgeSet = new TreeSet<>(new AgeComparator());

        int numberOfPersons = Integer.parseInt(scanner.nextLine());

        while (numberOfPersons-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);

            personNameSet.add(person);
            personAgeSet.add(person);
        }

        personNameSet.forEach(System.out::println);
        personAgeSet.forEach(System.out::println);
    }
}