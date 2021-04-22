package dio.desafios;

import java.io.IOException;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class AjudaBackup{
    public static void main(String[] args) throws IOException {

        List<String>frase = new ArrayList<>();

        frase.add("cassiano");
        frase.add("cassiano");
        frase.add("talita");
        frase.add("ébano");
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
        frase.add("eu");
        frase.add("ebano");
        frase.add("heleonor");
        frase.add("cassianos");

        //insira sua solução aqui

        TextoBlog textoBlog = new TextoBlog();

        for (String palavra : frase) {

            textoBlog.constroiTexto(palavra.trim().toLowerCase());
            textoBlog.menorTexto();

        }//while
        textoBlog.textoFinal();

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
        List<String> palavrasAbreviadas = new ArrayList<>();

        List<String>textoCompletoList = new ArrayList<>();
        List<String>textoTratadoList = new ArrayList<>();

        public void constroiTexto(String palavra){

            String palavraAbreviada;

            if(validaPalavra(palavra)){

                textoCompletoList.add(palavra);

                boolean palavraValidaAbreviada = validaPalavraAbreviada(palavra);

                if(palavraValidaAbreviada){

                    boolean naoContemLetra = contemNaoContemLetra(palavra);
                    boolean naoContemPalavra = contemNaoContemPalavra(palavra);

                    palavraAbreviada = palavra.charAt(0) + ".";

                    if (naoContemLetra && naoContemPalavra) {

                        dicionarioAdd(palavraAbreviada, palavra);

                        textoTratadoList.add(palavraAbreviada);
                        palavrasAbreviadas.add(palavra);
                        cont++;

                    }else if (!naoContemLetra && !naoContemPalavra) {

                        textoTratadoList.add(palavraAbreviada);

                    }else if(naoContemLetra){

                        textoTratadoList.add(palavra);

                    }else {

                        textoTratadoList.add(palavra);
                    }
                }else{

                    textoTratadoList.add(palavra);
                }
            }//validapalavraabreviada
        }//palavraAbreviada ok

        public void menorTexto(){

            for (String palavra :  palavrasAbreviadas) {

                for (String verifica: textoCompletoList) {

                    if((palavra.substring(0,1).equals(verifica.substring(0,1)))){

                        if(verifica.length() > palavra.length()){

                            Collections.replaceAll(palavrasAbreviadas, palavra, verifica);

                            dicionarioAdd(verifica.charAt(0)+".", verifica);
                            dicionarioRemove(palavra.charAt(0)+".", palavra);

                            Collections.replaceAll(textoTratadoList, palavra.charAt(0)+".", palavra);
                            Collections.replaceAll(textoTratadoList, verifica, verifica.charAt(0)+".");
                        }
                    }
                }
            }
        }//menorTexto

        public void textoFinal(){
            for (String palavra: textoTratadoList) {
                textoTratado = textoTratado +" "+palavra;
            }
        }//textoFinal

        private boolean contemNaoContemPalavra(String palavra){
            return !palavrasAbreviadas.contains(palavra);
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

        public void dicionarioAdd(String palavraAbreviada, String palavraCompleta){
            dicionarioLista.add(palavraAbreviada+" = "+palavraCompleta);
            Collections.sort(dicionarioLista);
        }//dicionario ok

        public void dicionarioRemove(String palavraAbreviada, String palavraCompleta){
            dicionarioLista.remove(palavraAbreviada+" = "+palavraCompleta);
        }//dicionario ok
    }//TextoBlog
}