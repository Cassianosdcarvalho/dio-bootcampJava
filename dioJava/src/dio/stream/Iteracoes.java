package dio.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5};
        String[] nomes = {"Cassiano", "Cassiano", "Talita", "Talita", "Helena", "Bruno", "Anderson", "Daliria", "Tiago", "Kyara", "Caio", "Romilton"};
        imprimirNomesFiltrados(nomes);
        imprimirTodosOsNomes(nomes);
        retornarODobro(numeros);

        List<String> profissoes = new ArrayList<>();

        profissoes.add("developer");
        profissoes.add("developerA");
        profissoes.add("developerB");
        profissoes.add("developerC");
        profissoes.add("developerD");
        profissoes.add("developerE");
        profissoes.add("developerF");
        profissoes.add("developerG");
        profissoes.add("developerH");

        profissoes.stream().filter(profissao -> profissao.startsWith("developerF")).forEachOrdered(System.out::println);


    }
    // String... nomes = String[] nomes
    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaimprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Cassiano")){
                nomesParaimprimir += nomes[i];
            }
        }
        System.out.println(nomesParaimprimir);

        String nomesParaImprimirStream = Stream.of(nomes).filter(nome -> nome.equals("Talita")).collect(Collectors.joining());
        System.out.println(nomesParaImprimirStream);
    }

    public static void imprimirTodosOsNomes(String... nomes){
        for (String nome : nomes){
            System.out.println("Lista do for: "+nome);
        }

        Stream.of(nomes).forEach(nome -> System.out.println("Lista do Stream: "+nome));
    }

    public static void retornarODobro(Integer... numeros){
        for (Integer numero : numeros){
            System.out.println(numero*2);
        }

        Stream.of(numeros).map(numero -> numero*2).forEach(System.out::println);
    }
}
