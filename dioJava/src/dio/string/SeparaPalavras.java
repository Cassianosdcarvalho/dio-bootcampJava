package dio.string;

import java.util.ArrayList;
import java.util.List;

public class SeparaPalavras {
    public static void main(String[] args) {
        String frase1  = "cassiano talita bruno bruna cassiano talita helena cassiano cassiano clara clara helena helen.";

        List<String> listPalavras = new ArrayList<>();

        String[] palavrasDaLinha = frase1.split(" ");
        /**
         * VAMOS ARAMZENAR O ARRAY NA LISTA
         */
        for(String palavra : palavrasDaLinha) {
            /**
             * VAMOS CONSIDERAR PALAVRAS APENAS O QUE TENHA UM TAMANHO MAIOR QUE 1
             * ESPACOS VAZIOS, TAMBÉM NAO SÃO CONSIDERADOS
             */
            if( palavra.trim().length() > 1 && !"".equals(palavra.trim())) {
                listPalavras.add(palavra);

            }
    }

        System.out.println(listPalavras);

    }


}
