package dio.thread;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {

        System.out.println("serial");
        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(numero -> fatorial(numero));// serail
        long fim = System.currentTimeMillis();
        System.out.println("tempo de execucao: "+(fim-inicio));

        //para um numero grande de objetos (processo)
        System.out.println("parallel");
        inicio  = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(numero -> fatorial(numero));//parallel
        fim = System.currentTimeMillis();
        System.out.println("tempo de execucao: "+(fim-inicio));

        //outro exemplo
        List<String> nomes = Arrays.asList("Joao", "Paulo", "Oliveira","Santos");
        nomes.parallelStream().forEach(System.out::println);
    }


    public static long fatorial(long numero){
        long fat = 1;
        for (int i = 2; i <= numero; i++) {
            fat*=i;
        }
        return fat;
    }
}
