package dio.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class ClassOptional {
    public static void main(String[] args) {

        Optional<String> existeValor = Optional.of("existe valor");
        System.out.println("valor opcional que esta presente");
        existeValor.ifPresentOrElse(System.out::println, () -> System.out.println("nao esta presente"));

        Optional<String> ValorNulo = Optional.ofNullable(null);
        System.out.println("valor opcional que nao esta presente---");
        ValorNulo.ifPresentOrElse(System.out::println, () -> System.out.println("null = nao presente"));

        Optional<String> valorVazio = Optional.empty();
        System.out.println("valor opcional que nao esta presente");
        valorVazio.ifPresentOrElse(System.out::println, () -> System.out.println("empty = nao esta presente"));

        Optional<String> erroNull = Optional.of(null);
        System.out.println("valor opcional que lanca erro nullPointerException");
        erroNull.ifPresentOrElse(System.out::println, () -> System.out.println("erro = nao esta presente"));


    }
}
