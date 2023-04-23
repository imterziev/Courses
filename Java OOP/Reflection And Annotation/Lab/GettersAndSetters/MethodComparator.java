package JavaOOP.ReflectionAndAnnotation.GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Comparator;

public class MethodComparator implements Comparator<Method> {
    @Override
    public int compare(Method f, Method s) {
        boolean firstIsGetter = f.getName().startsWith("get");
        boolean secondIsGetter = s.getName().startsWith("get");

        if (firstIsGetter && secondIsGetter) {
            return f.getName().compareTo(s.getName());
        }

        boolean firstIsSetter = f.getName().startsWith("set");
        boolean secondIsSetter = s.getName().startsWith("set");

        if (firstIsSetter && secondIsSetter) {
            return f.getName().compareTo(s.getName());
        }

        return Boolean.compare(secondIsGetter, firstIsGetter);
    }
}