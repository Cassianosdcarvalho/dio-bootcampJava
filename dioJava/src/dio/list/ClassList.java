package dio.list;

import java.util.ArrayList;
import java.util.List;

public class ClassList {
    public static void main(String[] args) {
        List<String> listas = new ArrayList<>();

        listas.add("Juliana");
        listas.add("Pedro");
        listas.add("Carlos");
        listas.add("Larissa");
        listas.add("Joao");

        for (String lista : listas) {
            System.out.println(lista);
        }

        listas.set(2, "Roberto");

        System.out.println(listas);

        String nome = listas.get(1);
        System.out.println(nome);

        listas.remove(3);
        System.out.println(listas);

        listas.remove("Joao");
        System.out.println(listas);

        System.out.println(listas.size());

        boolean verifica = listas.contains("Juliano");
        System.out.println(verifica);

        List<String> novaLista = new ArrayList<>();
        System.out.println(novaLista.isEmpty());
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");
        System.out.println(novaLista);

        for (String adciona: novaLista) {
            listas.add(adciona);
        }
        System.out.println(listas);

        System.out.println(listas.isEmpty());


    }
}
