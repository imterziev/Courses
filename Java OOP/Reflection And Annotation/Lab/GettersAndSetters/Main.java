package JavaOOP.ReflectionAndAnnotation.GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        Method[] allMethods = clazz.getDeclaredMethods();

        Arrays.stream(allMethods)
                .filter(m -> !m.getName().equals("toString"))
                .sorted(new MethodComparator())
                .forEach(Main::printMethodInfo);
    }

    private static void printMethodInfo(Method m) {
        System.out.println(m.getName().startsWith("get")
                ? m.getName() + " will return class " + m.getReturnType().getSimpleName()
                : String.format("%s and will set field of class %s", m.getName(), m.getParameterTypes()[0].getSimpleName()));
    }
}