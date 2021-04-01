package dio.interfacesFuncionais;

import java.util.function.Predicate;

public class ClassPredicate {
    public static void main(String[] args) {

        Predicate<String> estaVazioA = valor -> valor.isEmpty();
        Predicate<String> estaVazioB = String::isEmpty;// metodo de referencia
        System.out.println(estaVazioA.test(""));
        System.out.println(estaVazioB.test("cassiano"));


    }
}
