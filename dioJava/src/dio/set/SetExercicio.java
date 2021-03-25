package dio.set;

import java.util.TreeSet;

public class SetExercicio {
    public static void main(String[] args) {

        TreeSet<Integer> exercicio= new TreeSet<>();

        exercicio.add(3);
        exercicio.add(88);
        exercicio.add(20);
        exercicio.add(44);
        exercicio.add(3);
        System.out.println(exercicio);

        for (int ler: exercicio) {
            System.out.println(ler);
        }

        exercicio.pollFirst();
        System.out.println(exercicio);

        exercicio.add(23);
        System.out.println(exercicio);

        int size = exercicio.size();
        System.out.println(size);

        boolean vazio = exercicio.isEmpty();
        System.out.println(vazio);
    }
}
