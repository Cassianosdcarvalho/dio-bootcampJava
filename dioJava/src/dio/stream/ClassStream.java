package dio.stream;

import dio.list.ClassList;

import java.util.*;
import java.util.stream.Collectors;

public class ClassStream {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Juliana");
        lista.add("Pedro");
        lista.add("Carlos");
        lista.add("Larissa");
        lista.add("Joao");

        long contagem = lista.stream().count();
        System.out.println("tamanho da lista "+contagem);

        Optional maiorNumeroDeLetras = lista.stream().max(Comparator.comparingInt(String::length));
        System.out.println("maior String "+maiorNumeroDeLetras);

        Optional menorNumeorDeLetras = lista.stream().min(Comparator.comparingInt(String::length));
        System.out.println("menor String "+menorNumeorDeLetras);

        List contemLetra = lista.stream().filter((listas)-> listas.toLowerCase().contains("r")).collect(Collectors.toList());
        System.out.println("coleta apena o que tem a letra indicada "+ contemLetra);

        List itensComTamanho = lista.stream().map(listas -> listas.concat("--").concat(String.valueOf(listas.length()))).collect(Collectors.toList());
        System.out.println("nova lista com tamanhos de String "+itensComTamanho);

        List listaComLimietedeTamanho = lista.stream().limit(3).collect(Collectors.toList());
        System.out.println("coleta apenas os 3 primeiros elementos "+listaComLimietedeTamanho);

        System.out.println("exibe os elementos e os retorna (inicio)");
        List exibeERetorna = lista.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println("exibe os elementos e os retorna "+exibeERetorna);

        System.out.println("exibe os elementos sem retornar (fim)");
        lista.stream().forEach(System.out::println);

        Boolean retornaSeTodosTemParametro = lista.stream().allMatch((elemento) -> elemento.contains("h"));
        System.out.println("retorna TRUE se todos tem o parametro passado: "+ retornaSeTodosTemParametro);

        Boolean retornaSeAlgumTemParametro = lista.stream().anyMatch((elemento) -> elemento.contains("a"));
        System.out.println("retorna TRUE se todos tem o parametro passado: "+retornaSeAlgumTemParametro);

        Boolean retornaSeNaoExistir = lista.stream().noneMatch((elemento) -> elemento.contains("f"));
        System.out.println("retornar TRUE se nenhum elemento possui o parametro: "+ retornaSeNaoExistir);

        System.out.println("retorna Primeiro Elemento se existir");
        lista.stream().findFirst().ifPresent(System.out::println);

        System.out.println("exemplo de operacao encadeada (inicio): ");
        List operacaoEncadeada = lista.stream().peek(System.out::println).map(elemento -> elemento.concat("--").
                concat(String.valueOf((elemento.length())))).peek(System.out::println).filter((elemento) -> elemento.toLowerCase().contains("r"))
                .collect(Collectors.toList());
        System.out.println(operacaoEncadeada);
        System.out.println("exemplo de operacao encadeada (fim): ");
        }
    }
