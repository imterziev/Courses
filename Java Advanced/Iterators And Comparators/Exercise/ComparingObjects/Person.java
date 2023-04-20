package JavaAdvanced.IteratorsAndComparators.Exercise.ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person other) {
        int compared = this.name.compareTo(other.name);

        if (compared == 0) {
            compared = Integer.compare(this.age, other.age);
        }

        if (compared == 0) {
            compared = this.town.compareTo(other.town);
        }

        return compared;
    }
}