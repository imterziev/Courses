package JavaOOP.ReflectionAndAnnotation.CodingTracker;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Class<Tracker> trackerClass = Tracker.class;

        List<Author> list = Arrays.stream(trackerClass.getDeclaredMethods())
                .filter(m -> m.getAnnotation(Author.class) != null)
                .map(m -> m.getAnnotation(Author.class))
                .collect(Collectors.toList());

        list.forEach(a -> System.out.println(a.name()));
    }
}