package dio.desafios;

import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class AjudaBackup {
    public static void main(String[] args) throws IOException {

        List<String>entrada = new ArrayList<>();

        entrada.add("cassiano");
        entrada.add("talita");
        entrada.add("juliana");
        entrada.add("cassiano");
        entrada.add("cassiano");
        entrada.add("clara");
        entrada.add("abcdef");
        entrada.add(".");
        entrada.add("abc");
        entrada.add("abc");
        entrada.add("abc");
        entrada.add("cassiano");
        entrada.add("clara");
        entrada.add("");
        entrada.add("     ");

        //insira sua solução aqui

        TextoBlog textoBlog = new TextoBlog();

        for (String palavra : entrada) {

           textoBlog.abreviaNaoAbrevia(palavra.trim());

        }//while

        System.out.println(textoBlog.textoTratado.trim());
        System.out.println(textoBlog.cont);
        for (String index: textoBlog.dicionarioLista) {
            System.out.println(index);
        }
    }//main

    static class TextoBlog {

        private String textoTratado = "";
        private int cont = 0;

        List<String>dicionarioLista = new ArrayList<>();
        List<String>letras = new ArrayList<>();

        public void abreviaNaoAbrevia(String palavra){
            String  palavraAbreviada;
            if((validaPalavra(palavra)) && (validaPalavraAbreviada(palavra) && (contemNaoContemLetra(palavra)))){
                palavraAbreviada = palavra.charAt(0)+".";
                dicionario(palavraAbreviada, palavra);
                textoTratado = textoTratado + " "+ palavraAbreviada;
                cont++;
            }else if((validaPalavra(palavra))){
                textoTratado = textoTratado + " "+ palavra;
            }
        }//palavraAbreviada ok

        private boolean validaPalavra(String palavra){
           return (palavra != null) && (!palavra.isEmpty()) && (!palavra.equals("."));
        }//validaPalavra ok

        private boolean validaPalavraAbreviada(String palavra){
            String  palavraAbreviada = palavra.charAt(0)+".";

            return (palavraAbreviada.length() < palavra.length());
        }//abreviaNaoAbrevia ok

        private boolean contemNaoContemLetra(String palavra){
           String letra = palavra.substring(0,1);
            if(letras.contains(letra)){
                return false;
            }else{
                letras.add(letra);
                return true;
            }
        }//alfabeto ok

        public void dicionario(String palavraAbreviada, String palavraCompleta){
            dicionarioLista.add(palavraAbreviada+" = "+palavraCompleta);
        }//dicionario ok
    }//TextoBlog
}