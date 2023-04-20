package JavaAdvanced.Generics.Lab.GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    public static <T> T[] create(int length, T defaultItem) {
        T[] arr = (T[]) Array.newInstance(defaultItem.getClass(), length);

        Arrays.fill(arr, defaultItem);

        return arr;
    }

    public static <T> T[] create(Class<T> tClass, int length, T defaultItem) {
        T[] arr = (T[]) Array.newInstance(tClass, length);

        Arrays.fill(arr, defaultItem);

        return arr;
    }
}