package JavaAdvanced.Generics.Lab.ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        isEmpty(list);

        return Collections.min(list);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        isEmpty(list);

        return Collections.max(list);
    }

    private static <T> void isEmpty(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty list");
        }
    }
}