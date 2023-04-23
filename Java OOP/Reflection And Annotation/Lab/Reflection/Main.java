package JavaOOP.ReflectionAndAnnotation.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<Reflection> reflection = Reflection.class;
        System.out.println(reflection.getSimpleName());
        System.out.println(reflection.getSuperclass().getSimpleName());

        Class<? super Reflection> superclass = reflection.getSuperclass();
        System.out.println(superclass);

        Class[] interfaces = reflection.getInterfaces();

        Arrays.stream(interfaces)
                .map(Class::getSimpleName)
                .forEach(System.out::println);

        Constructor<Reflection> declaredConstructor = reflection.getDeclaredConstructor();

        System.out.println("------------------");
        Reflection reflection1 = declaredConstructor.newInstance();
        System.out.println(reflection1);

        System.out.println("------------------");
        Constructor<?>[] declaredConstructors = reflection.getDeclaredConstructors();
        Arrays.stream(declaredConstructors).forEach(System.out::println);

        System.out.println("------------------");
        Constructor<Reflection> declaredConstructor1 = reflection.getDeclaredConstructor(String.class, String.class, String.class);
        declaredConstructor1.setAccessible(true);
        System.out.println(declaredConstructor1);

        System.out.println("------------------");
        Parameter[] parameters = declaredConstructor1.getParameters();
        Arrays.stream(parameters)
                .map(Parameter::getType)
                .forEach(System.out::println);

        System.out.println("------------------");
        Reflection reflection2 = declaredConstructor1.newInstance("A", "A", "A");
        System.out.println(reflection2);

        System.out.println("------------------");
        Field zip = reflection.getDeclaredField("zip");
        zip.setAccessible(true);
        zip.set(reflection2, 21);
        System.out.println(reflection2);

        System.out.println("------------------");
        Field[] declaredFields = reflection.getDeclaredFields();
        Field declaredField = declaredFields[0];
    }
}