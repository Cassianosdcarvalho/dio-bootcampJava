package dio.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassArray {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Cassiano");
        nomes.add("Talita");
        nomes.add("Helena");
        nomes.add("Magda");
        nomes.add("Bruno");
        nomes.add("Anderson");
        nomes.add("Romilton");

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);
    }
}
