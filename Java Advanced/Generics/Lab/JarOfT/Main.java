package JavaAdvanced.Generics.Lab.JarOfT;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> integerJar = new Jar<>();

        integerJar.add(13);
        integerJar.add(42);
        integerJar.add(69);
        integerJar.add(73);

        Integer remove = integerJar.remove();
    }
}