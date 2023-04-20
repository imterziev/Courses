package JavaAdvanced.Generics.Lab.ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 3, 4, 15);

        List<Integer> integers1 = List.of(32, 54, 52134);

        Integer maxInteger = ListUtils.getMax(integers);

        System.out.println(maxInteger);
        System.out.println(ListUtils.getMin(integers));
    }
}