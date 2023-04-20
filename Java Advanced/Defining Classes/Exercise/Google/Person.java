package JavaAdvanced.DefiningClasses.Exercise.Google;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parent> parentList;
    private List<Children> childrenList;
    private List<Pokemon> pokemonList;

    public Person(String name) {
        this.name = name;
        parentList = new ArrayList<>();
        childrenList = new ArrayList<>();
        pokemonList = new ArrayList<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void addParent(Parent parent) {
        parentList.add(parent);
    }

    public void addChildren(Children children) {
        childrenList.add(children);
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        String companyPrint = company != null
                ? company.toString()
                : "";

        String carPrint = car != null
                ? car.toString()
                : "";

        String pokemonPrint = pokemonList.isEmpty()
                ? ""
                : pokemonList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(System.lineSeparator())) + "\n";

        String parentPrint = parentList.isEmpty()
                ? ""
                : parentList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(System.lineSeparator())) + "\n";

        String childrenPrint = childrenList.isEmpty()
                ? ""
                : childrenList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(System.lineSeparator())) + "\n";

        stringBuilder.append(name).append("\n")
                .append("Company:").append("\n").append(companyPrint)
                .append("JavaOOP.Inheritance.Exercise.NeedForSpeed.SecondTests.Car:").append("\n").append(carPrint)
                .append("Pokemon:").append("\n").append(pokemonPrint)
                .append("Parents:").append("\n").append(parentPrint)
                .append("Children:").append("\n").append(childrenPrint);

        return stringBuilder.toString();
    }
}