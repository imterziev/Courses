package JavaAdvanced.Generics.Exercise.GenericCountMethodDoubles;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public int countGreaterElement(T element) {
        int counter = 0;

        for (T t : elements) {
            int greater = element.compareTo(t);

            if (greater < 0) {
                counter++;
            }
        }

        return counter;
    }
}