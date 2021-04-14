package dio.desafios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;



public class Teste {
    public static void main(String[] args) {
               //insira sua solução aqui
        String s = "cassiano talita bruno cassiano";
        List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
        Collection<String> frase = List.of("cassiano", "talita", "bruno", "cassiano");
        System.out.println(myList);
        myList.stream()
                .distinct() //nao permite processar elementos repetidos
               //.limit(1)// limita a 1 caracter
                .forEach(System.out::println);
    }
}

