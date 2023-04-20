package ProgrammingFundamentals.ObjectsAndClasses.Exercise.OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person person = new Person(name, age);
            people.add(person);
        }

        people = people.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

        for (Person person : people) {
            if (person.getAge() > 30) {
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }
    }
}