package JavaAdvanced.IteratorsAndComparators.Exercise.Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ListyIterator implements Iterable<String> {
    private List<String> elements;
    private int cursor;

    public ListyIterator(String... elements) {
        this.setElements(elements);
        this.cursor = 0;
    }

    private void setElements(String... elements) {
        this.elements = Arrays.stream(elements).collect(Collectors.toList());
    }

    public void add(String... elements) {
        this.setElements(elements);
    }

    public boolean move() {
        if (!hasNext()) {
            return false;
        }

        cursor++;

        return true;
    }

    public boolean hasNext() {
        return this.cursor < this.elements.size() - 1;
    }

    public void print() {
        if (this.elements.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }

        System.out.println(this.elements.get(this.cursor));
    }

    public void printAll() {
        this.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index;

            @Override
            public boolean hasNext() {
                return this.index < elements.size();
            }

            @Override
            public String next() {
                String element = elements.get(index);

                index++;

                return element;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        this.elements.forEach(action::accept);
    }
}