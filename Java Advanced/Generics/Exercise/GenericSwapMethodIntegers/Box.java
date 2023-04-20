package JavaAdvanced.Generics.Exercise.GenericSwapMethodIntegers;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T swap = elements.get(firstIndex);
        elements.set(firstIndex, elements.get(secondIndex));
        elements.set(secondIndex, swap);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (T element : elements) {
            stringBuilder.append(String.format("%s: %s\n", element.getClass().getName(), element));
        }

        return stringBuilder.toString();
    }
}