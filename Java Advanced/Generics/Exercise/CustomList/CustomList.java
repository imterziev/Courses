package JavaAdvanced.Generics.Exercise.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        return this.elements.stream()
                .max(Comparator.naturalOrder()).get();
    }

    public T getMin() {
        return this.elements.stream()
                .min(Comparator.naturalOrder()).get();
    }

    public int size() {
        return this.elements.size();
    }

    public T get(int index) {
        return this.elements.get(index);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (T element : this.elements) {
            stringBuilder.append(element).append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}