package JavaAdvanced.Generics.Lab.GenericArrayCreator;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = ArrayCreator.create(10, 15);
        String[] strings = ArrayCreator.create(String.class, 10, "a");

        System.out.println();
    }
}