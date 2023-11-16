package Problema_generics2.Services;

import java.util.List;

public class CalculeServices {
    public static <T extends Comparable<? super T>> T max(List<T> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("a lista não pode estar vazia");
        }
        T max = lista.get(0);
        for (T item :
                lista) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
