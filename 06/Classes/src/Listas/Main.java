package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Maira");
        list.add("Luiz");
        list.add("Mario");
        list.add(3, "Mariana");
        list.add(1, "Bruno");

        list.removeIf(x -> x.charAt(0) == 'M');
        // não faço ideia, deve ter ocorrido alguma atualização sobre essa funcionalidade, pois está tendo um resultado diferente do curso (Pesquise mais depois).
        List<String> result = Collections.singletonList(list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null));

        String result2 = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(list);
        System.out.println(list.size());
    }
}
