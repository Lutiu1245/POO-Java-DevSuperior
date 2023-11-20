package Curingas_delimitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.27);
        List<Object> myObjects = new ArrayList<Object>();

        copy(myInts, myObjects);
        System.out.println(myObjects);
        copy(myDoubles, myObjects);
        System.out.println(myObjects);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number :
                source) {
            destiny.add(number);
        }
    }
}
