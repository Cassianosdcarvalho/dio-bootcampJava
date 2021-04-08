package dio.inferencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

//deducao de uma verdade subentendidade ex. sabemos que uma palavra 'e do tipo String
// a inferencia de tipos no java foi implementado no java 10 com a variavel var
// var pode ser utilizado apenas para variaveis locais
// var precisa ser iniciadas
// var nao pode ser utilizado como parametro e nao pode ser null ou void

public class Inferencia {
    public static void main(String[] args) throws IOException {
        //connectAndPrintURLOracle();
        //connectAndPrintURLOracleInferencia();
        testar("Cassiano", "Carvalho");
    }

    private static void connectAndPrintURLOracle() throws IOException {
        URL endereco = new URL("https://docs.oracle.com/javase/10/language/");
        URLConnection urlConnection =  endereco.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    private static void connectAndPrintURLOracleInferencia() throws IOException {
        URL endereco = new URL("https://docs.oracle.com/javase/10/language/");
        var enderecoInferencia = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnectionInferenia =  endereco.openConnection();
        var bufferedReaderInferencia = new BufferedReader(new InputStreamReader(urlConnectionInferenia.getInputStream()));
        System.out.println(bufferedReaderInferencia.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    public static void testar(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);


    }
}
