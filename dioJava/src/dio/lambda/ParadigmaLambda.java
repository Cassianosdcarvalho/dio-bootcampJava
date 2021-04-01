package dio.lambda;

import jdk.swing.interop.SwingInterOpUtils;

public class ParadigmaLambda {
    public static void main(String[] args) {
        //SINTAXE BASE
        //InterfaceFuncional nomeVariavel = parametro -> logica

    Funcao lambdaSimples = valor -> "lambda simples\n"+"sr "+ valor;

        Funcao lambdaComMaisDeUmParametro = valor -> {
            System.out.println("lambda complexa");
            System.out.println("MESTRE " + valor);
            System.out.println(valor);
            System.out.println(valor+" CARVALHO");
            return valor;
        };

        System.out.println(lambdaSimples.gerar("cassiano"));
        lambdaComMaisDeUmParametro.gerar("CASSIANO");
    }

    interface Funcao {
        String gerar(String valor);
    }
}
