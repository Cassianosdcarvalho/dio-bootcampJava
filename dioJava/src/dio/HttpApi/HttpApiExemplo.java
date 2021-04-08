package dio.HttpApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Collectors;

public class HttpApiExemplo {
    public static void main(String[] args) throws IOException, InterruptedException {
         connectHttp();
    }

    //realise  antiga
    private static void connectAndPrintURLOracleInferencia() throws IOException {
        URL endereco = new URL("https://docs.oracle.com/javase/10/language/");
        var enderecoInferencia = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnectionInferenia =  endereco.openConnection();
        var bufferedReaderInferencia = new BufferedReader(new InputStreamReader(urlConnectionInferenia.getInputStream()));
        System.out.println(bufferedReaderInferencia.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

//release nova jdk11
    private static void connectHttp() throws IOException, InterruptedException {//nova rlise versao jdk 11
        HttpRequest requisicao = HttpRequest.newBuilder().GET().uri(URI.create("https://docs.oracle.com/javase/10/language/")).build();


        HttpClient cliente = HttpClient.newHttpClient();

        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code: "+ resposta.statusCode());
        System.out.println("Headers response: "+ resposta.headers());
        System.out.println("corpo: "+ resposta.body());
    }

    public static void connectHttp2(){

    }
}
