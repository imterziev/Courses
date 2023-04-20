package JavaAdvanced.IteratorsAndComparators.Exercise.StrategyPattern;

import java.util.Comparator;

public class NameLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        int compared = Integer.compare(first.getName().length(), second.getName().length());

        if (compared == 0) {
            compared = Character.compare(first.getName().toLowerCase().charAt(0), second.getName().toLowerCase().charAt(0));
        }

        return compared;
    }
}