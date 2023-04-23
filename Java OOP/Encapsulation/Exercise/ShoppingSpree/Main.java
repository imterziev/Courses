package JavaOOP.Encapsulation.Exercises.ShoppingSpree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Person> personList = new LinkedHashMap<>();

        String[] inputPeople = getInput(scanner);

        for (String element : inputPeople) {
            String[] personData = element.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);

            try {
                Person person = new Person(name, money);

                personList.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        Map<String, Product> productList = new HashMap<>();

        String[] inputProducts = getInput(scanner);

        for (String element : inputProducts) {
            String[] productData = element.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try {
                Product product = new Product(name, cost);

                productList.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];

            if (personList.isEmpty()) {
                break;
            }

            try {
                Person person = personList.get(personName);
                Product product = productList.get(productName);

                person.buyProduct(product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            input = scanner.nextLine();
        }

        for (Person person : personList.values()) {
            System.out.print(person.getName() + " - ");
            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                System.out.println(person.getProducts().stream().map(Product::getName).collect(Collectors.joining(", ")));
            }
        }
    }

    private static String[] getInput(Scanner scanner) {
        return scanner.nextLine().split(";");
    }
}