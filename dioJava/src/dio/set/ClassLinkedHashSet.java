package dio.set;

import java.util.LinkedHashSet;

public class ClassLinkedHashSet {
    public static void main(String[] args) {

        //nao pode alterar a ordem de inserçao dos elementos
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        numeros.add(10);
        numeros.add(1);
        numeros.add(0);
        numeros.add(90);
        numeros.add(30);

        System.out.println(numeros);

        numeros.remove(4);



    }


}
