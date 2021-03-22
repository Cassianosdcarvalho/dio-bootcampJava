package dio.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ClassQueue {
    public static void main(String[] args) {

        Queue<String> nome = new LinkedList<>();

        nome.add("juliana");
        nome.add("Pedro");
        nome.add("Carlos");
        nome.add("Larissa");
        nome.add("Joao");

        for (String nomes : nome){
            System.out.println(nomes);
        }

        String print;

        print = nome.peek();
        System.out.println("peek" + print);

        print = nome.poll();
        System.out.println(print);

        nome.add("Daniel");
        System.out.println(nome);

        System.out.println(nome.size());

        System.out.println(nome.isEmpty());

        System.out.println(nome.contains("Daniel"));
    }
}
