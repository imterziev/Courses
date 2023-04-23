package JavaOOP.ReflectionAndAnnotation.CodingTracker;

public class Tracker {

    @Author(name = "George")
    public static void printMethodsByAuthor() {

    }

    @Author(name = "Ivo")
    public String getA() {
        return "A";
    }
}