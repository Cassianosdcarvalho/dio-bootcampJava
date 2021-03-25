package dio.set;

import java.util.HashSet;
import java.util.Set;

public class ClassHashSet {
    public static void main(String[] args) {

        //modo set mais rapido, nao se preoculpa com sequencia de insecçao
        Set<Double> notaAlunos = new HashSet<>();

        notaAlunos.add(5.8);
        notaAlunos.add(4.8);
        notaAlunos.add(7.8);
        notaAlunos.add(3.8);
        notaAlunos.add(9.8);
        notaAlunos.add(8.8);


        System.out.println(notaAlunos);

        notaAlunos.remove(5.8);

        System.out.println(notaAlunos);
    }
}
