package JavaAdvanced.IteratorsAndComparators.Exercise.StackIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StackIterator implements Iterable<Integer> {
    private List<Integer> elements;
    private int cursor;

    public StackIterator(int... elements) {
        this.elements = new ArrayList<>();
        this.cursor = -1;
    }

    public void push(int... elements) {
        for (int element : elements) {
            this.elements.add(element);
            cursor++;
        }
    }

    public void pop() {
        if (this.cursor < 0) {
            System.out.println("No elements");
            return;
        }

        this.elements.remove(cursor);

        this.cursor--;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int lastIndex = cursor;

            @Override
            public boolean hasNext() {
                return lastIndex >= 0;
            }

            @Override
            public Integer next() {
                int nextElement = elements.get(lastIndex);

                lastIndex--;

                return nextElement;
            }
        };
    }
}