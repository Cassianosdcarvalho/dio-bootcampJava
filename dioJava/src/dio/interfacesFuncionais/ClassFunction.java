package dio.interfacesFuncionais;

import java.util.function.Function;

public class ClassFunction {
    public static void main(String[] args) {

        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNomeAoContrario.apply("Joao"));

        Function<String, Integer> converteStringparaInteiro = stringParaInteiro -> Integer.valueOf(stringParaInteiro);
        System.out.println(converteStringparaInteiro.apply("20"));

        Function<String, Integer> converteERetornaODobro = stringParaDobro -> Integer.valueOf(stringParaDobro) * 2;
        System.out.println(converteERetornaODobro.apply("50"));

    }
}
