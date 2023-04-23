package JavaOOP.Polymorphism.Lab.Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String explainSelf() {
        return "I am " + this.name + " and my favourite food is " + this.favouriteFood;
    }
}