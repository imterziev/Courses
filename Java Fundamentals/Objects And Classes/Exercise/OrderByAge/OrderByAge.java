package ProgrammingFundamentals.ObjectsAndClasses.Exercise.OrderByAge;

public class OrderByAge {
    private String name;
    private String id;
    private int age;

    public OrderByAge(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", name, id, age);
    }
}