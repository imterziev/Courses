package JavaAdvanced.DefiningClasses.Exercise.Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Person> persons = new HashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String name = data[0];
            String token = data[1];
            String tokenName = data[2];
            String tokenType = data[3];

            Company company;
            Pokemon pokemon;
            Parent parent;
            Children children;
            Car car;

            Person person = new Person(name);
            persons.putIfAbsent(name, person);

            switch (token) {
                case "company":
                    double salary = Double.parseDouble(data[4]);
                    company = new Company(tokenName, tokenType, salary);
                    persons.get(name).setCompany(company);
                    break;
                case "pokemon":
                    pokemon = new Pokemon(tokenName, tokenType);
                    persons.get(name).addPokemon(pokemon);
                    break;
                case "parents":
                    parent = new Parent(tokenName, tokenType);
                    persons.get(name).addParent(parent);
                    break;
                case "children":
                    children = new Children(tokenName, tokenType);
                    persons.get(name).addChildren(children);
                    break;
                case "car":
                    car = new Car(tokenName, tokenType);
                    persons.get(name).setCar(car);
                    break;
            }

            input = scanner.nextLine();
        }

        String searchPerson = scanner.nextLine();

        System.out.print(persons.get(searchPerson).toString());
    }
}