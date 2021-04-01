//FUNCAO DE ALTA ORDEM
//por parametro recebe outra funcao ou que ela retorna uma funcao
package dio.interfacesFuncionais;

public class FuncaoDeAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (numeroA, numeroB) -> numeroA+numeroB;
        Calculo subtracao = (numeroA, numeroB) -> numeroA-numeroB;
        Calculo multiplicacao = (numeroA, numeroB) -> numeroA*numeroB;
        Calculo divisao = (numeroA, numeroB) -> numeroA/numeroB;

        System.out.println(executaCalculo(soma, 10, 2));
        System.out.println(executaCalculo(subtracao, 10, 2));
        System.out.println(executaCalculo(multiplicacao, 10, 2));
        System.out.println(executaCalculo(divisao, 10, 2));
    }

    public static int executaCalculo(Calculo calculo, int numA, int numB){
        return  calculo.calculo(numA, numB);
    }
    @FunctionalInterface
    interface Calculo{
        int calculo(int numeroA, int numeroB);
    }
}
