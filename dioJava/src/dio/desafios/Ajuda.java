package dio.desafios;

import java.io.IOException;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Ajuda{
    public static void main(String[] args) throws IOException {

        List<String>frase = new ArrayList<>();

        frase.add("cassiano");
        frase.add("cassiano");
        frase.add("talita");
        frase.add("helena");
        frase.add("cassiano");
        frase.add("clara");
        frase.add("abcdef");
        frase.add("helena");
        frase.add(".");
        frase.add("abc");
        frase.add("abc");
        frase.add("abc");
        frase.add("cassiano");
        frase.add("clara");
        frase.add("");
        frase.add("     ");
        frase.add("helena");
        frase.add("helen");

        //insira sua solução aqui

        TextoBlog textoBlog = new TextoBlog();

        for (String palavra : frase) {

            textoBlog.constroiTexto(palavra.trim().toLowerCase());

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
        List<String>palavras = new ArrayList<>();

        public void constroiTexto(String palavra){

            String palavraAbreviada;

            if(validaPalavra(palavra)){

                boolean palavraValidaAbreviada = validaPalavraAbreviada(palavra);

                if(palavraValidaAbreviada){

                    boolean naoContemLetra = contemNaoContemLetra(palavra);
                    boolean naoContemPalavra = contemNaoContemPalavra(palavra);

                    palavraAbreviada = palavra.charAt(0) + ".";

                    if (naoContemLetra && naoContemPalavra) {

                        dicionario(palavraAbreviada, palavra);
                        textoTratado = textoTratado + " " + palavraAbreviada;
                        palavras.add(palavra);
                        cont++;

                    }else if (!naoContemLetra && !naoContemPalavra) {
                        textoTratado = textoTratado + " " + palavraAbreviada;

                    }else if(naoContemLetra){
                        textoTratado = textoTratado + " " + palavra;

                    }else {
                        textoTratado = textoTratado + " " + palavra;

                    }
                }else{
                    textoTratado = textoTratado + " " + palavra;
                }
            }//validapalavraabreviada
        }//palavraAbreviada ok

        private boolean contemNaoContemPalavra(String palavra){
            return !palavras.contains(palavra);
        }//alfabeto ok

        private boolean validaPalavra(String palavra){
            return (palavra != null) && (!palavra.isEmpty()) && (!palavra.equals("."));
        }//validaPalavra ok

        private boolean validaPalavraAbreviada(String palavra){
            String  palavraAbreviada = palavra.charAt(0)+".";
            return (palavraAbreviada.length() < palavra.length());
        }//abreviaNaoAbrevia ok

        private boolean contemNaoContemLetra(String palavra){
            String letra = palavra.substring(0,1);
            if(!letras.contains(letra)){
                letras.add(letra);
                return true;
            }else{
                return false;
            }
        }//alfabeto ok

        public void dicionario(String palavraAbreviada, String palavraCompleta){
            dicionarioLista.add(palavraAbreviada+" = "+palavraCompleta);
            Collections.sort(dicionarioLista);
        }//dicionario ok
    }//TextoBlog
}