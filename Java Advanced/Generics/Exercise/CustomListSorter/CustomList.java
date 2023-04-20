package JavaAdvanced.Generics.Exercise.CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public T remove(int index) {
        return this.elements.remove(index);
    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(this.elements, firstIndex, secondIndex);
    }

    public int countGreaterThan(T element) {
        return (int) this.elements.stream()
                .filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
        return Collections.max(this.elements);
    }

    public T getMin() {
        return Collections.min(this.elements);
    }

    public void sort() {
        Collections.sort(this.elements);
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();

        for (T element : elements) {
            stringBuilder.append(String.format("%s\n", element));
        }

        System.out.print(stringBuilder);
    }
}