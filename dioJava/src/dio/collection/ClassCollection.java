package dio.collection;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ClassCollection {
    public static void main(String[] args) {


        Collection<String> nomes = List.of("cassiano", "tslita", "bruno");
        Collection<String> nomesB = Set.of("cassiano", "tslita", "bruno");

        System.out.println(nomes);
        System.out.println(nomesB);


    }

}
