package JavaAdvanced.IteratorsAndComparators.Lab;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book first, Book second) {
        int compare = first.getTitle().compareTo(second.getTitle());

        if (compare == 0) {
            compare = Integer.compare(first.getYear(), second.getYear());
        }

        return compare;
    }
}