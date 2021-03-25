package dio.set;

import java.util.TreeSet;

public class ClassTreeSet {
    public static void main(String[] args) {
        //leitura com performace, gravavao mais lenta
        TreeSet<String> arvore = new TreeSet<>();

        arvore.add("Laranjeira");
        arvore.add("Jabuticabeira");
        arvore.add("Jacaranda");
        arvore.add("Oliveira");
        arvore.add("Salgueiro");

        System.out.println(arvore);
        System.out.println("primeiro elemento: "+arvore.first());
        System.out.println("ultimo elemento: "+arvore.last());
        System.out.println("maior elemento neste conjunto menor ou igual ao elemento fornecido, ou null se não houver: "+arvore.floor("Oliveira"));
        System.out.println("primeiro elemento abaixo do apontado: "+arvore.lower("Laranjeira"));
        System.out.println("primeiro elemento acima do apontado: "+arvore.higher("Jacaranda"));
        System.out.println("primeiro elemento e o remove: "+arvore.pollFirst());
        System.out.println("Ultimo elemento e o remove: "+arvore.pollLast());
    }

}
