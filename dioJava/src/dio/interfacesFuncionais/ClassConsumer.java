package dio.interfacesFuncionais;

import java.util.function.Consumer;

public class ClassConsumer {
    public static void main(String[] args) {

        Consumer<String> imprimiUmaFraseA = System.out::println;
        Consumer<String> imprimiUmaFraseB = frase -> System.out.println(frase);
        imprimiUmaFraseA.accept("Hello Word");
        imprimiUmaFraseB.accept("Hello Word B");


    }
}
