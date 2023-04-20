package JavaAdvanced.IteratorsAndComparators.Exercise.Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> lake;

    public Lake(List<Integer> lake) {
        this.lake = lake;
    }

    private class Frog implements Iterator<Integer> {
        private int index = 0;

        boolean firstRoundIsFinished = false;

        @Override
        public boolean hasNext() {
            return index < lake.size();
        }

        @Override
        public Integer next() {
            int currentIndex = index;

            index += 2;

            if (index >= lake.size() && !firstRoundIsFinished) {
                index = 1;
                firstRoundIsFinished = true;
            }

            return lake.get(currentIndex);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }
}