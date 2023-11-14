package Problema_reuso1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintService<T> {

    List<T> valores = new ArrayList<>();
    public void addValue(T value) {
        valores.add(value);
    }
    public T first() {
        return valores.getFirst();
    }
    public void print() {
        System.out.println("[");
        System.out.println(first());
        for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i));
        }
        System.out.println("]");

    }
}
