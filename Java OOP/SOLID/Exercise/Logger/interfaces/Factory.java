package JavaOOP.SOLID.Logger.interfaces;

public interface Factory<T> {

    T produce(String input);
}