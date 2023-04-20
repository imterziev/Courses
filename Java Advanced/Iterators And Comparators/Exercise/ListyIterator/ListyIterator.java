package JavaAdvanced.IteratorsAndComparators.Exercise.ListyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListyIterator {
    private List<String> elements;
    private int cursor;

    public ListyIterator(String... elements) {
        this.setElements(elements);
        this.cursor = 0;
    }

    private void setElements(String... elements) {
        this.elements = Arrays.stream(elements).collect(Collectors.toList());
    }

    public boolean move() {
        if (isEndOfList()) {
            return false;
        }

        this.cursor++;

        return true;
    }

    public boolean hasNext() {
        return !isEndOfList();
    }

    private boolean isEndOfList() {
        if (this.cursor + 1 >= this.elements.size()) {
            return true;
        }

        return false;
    }

    public void print() {
        if (this.elements.isEmpty()) {
            System.out.println("Invalid Operation!");
            return;
        }

        System.out.println(elements.get(cursor));
    }
}