package dio.inferencia;

import java.util.function.Function;

public class InferenciaLambda {
    public static void main(String[] args) {
        String variavelNormal = "Variavel normal";
        var variavelInferencia = "VariavelInferencia";
        Function<Integer,Double> divisor = (var numero) -> numero / 2D;

        System.out.println(variavelNormal);
        System.out.println(variavelInferencia);//variavel inferenciada com lambda
        System.out.println("Exemplo de variavel inferenciada com lambda "+ divisor.apply(654654564));
    }
}
