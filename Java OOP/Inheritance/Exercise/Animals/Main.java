package JavaOOP.Inheritance.Exercise.Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        List<Animal> animals = new ArrayList<>();

        while (!type.equals("Beast!")) {
            String[] animalData = scanner.nextLine().split("\\s+");
            String name = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            String gender = animalData[2];

            try {
                Animal animal = null;
                switch (type) {
                    case "Dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "Frog":
                        animal = new Frog(name, age, gender);
                        break;
                    case "Cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "Kitten":
                        animal = new Kitten(name, age);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(name, age);
                        break;
                }

                animals.add(animal);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            type = scanner.nextLine();
        }

        animals.forEach(System.out::println);
    }
}