package JavaAdvanced.Generics.Exercise.GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.swap(this.elements, firstIndex, secondIndex);
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