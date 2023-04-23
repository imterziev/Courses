package JavaOOP.Inheritance.Lab.ReusingClasses;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {

    public E getRandomElement() {
        int end = super.size() - 1;

        Random random = new Random();

        int getRandom = random.nextInt(end);

        return super.get(getRandom);
    }
}