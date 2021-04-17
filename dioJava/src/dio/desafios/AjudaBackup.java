package dio.desafios;

import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

public class AjudaBackup {
    public static void main(String[] args) throws IOException {

        List<String>entrada = new ArrayList<>();

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
        String palavra = "";

        for (int i = 0; i < entrada.size(); i++) {

            palavra = entrada.get(i).trim();

            textoBlog.textoCompleto(palavra);
            System.out.println(textoBlog.textoLista);

        }//while
        System.out.println(textoBlog.textoCompleto(palavra.trim()));
        System.out.println(textoBlog.cont);
    }//main

    static class TextoBlog {

        private String texto = "";
        int cont = 0;

        List<String>textoLista = new ArrayList<>();
        List<String>dicionarioLista = new ArrayList<>();

        List<String>letras = new ArrayList<>();

        public String textoCompleto(String palavra){

            if(validaPalavra(palavra) == true){
                texto = texto +" "+palavra;
            }
            return texto.trim();
        }//textoCompleto ok

        private boolean validaPalavra(String palavra){

            if((palavra == null) || (palavra.isEmpty()) || (palavra.equals("."))) {
                return false;
            }else{
                return true;
            }
        }//validaPalavra ok

        private boolean alfabeto(String palavra){
            String letra;

            letra = palavra.substring(0,1);

            if(letras.contains(letra)){
                return false;
            }else{
                letras.add(letra);
                return true;
            }
        }//alfabeto ok

        public boolean validaPalavraAbreviada(String palavra){

            String  palavraAbreviada = palavra.charAt(0)+".";

            if(palavraAbreviada.length() < palavra.length()){
                return true;
            }else{
                return false;
            }
        }//abreviaNaoAbrevia ok

        public String palavraAbreviada(String palavra){
            String  palavraAbreviada = "";
            if((validaPalavra(palavra)) == true && (validaPalavraAbreviada(palavra) == true && (alfabeto(palavra) == true)) ){
               palavraAbreviada = palavra.charAt(0)+".";
               textoLista.add(palavraAbreviada);
               dicionario(palavraAbreviada, palavra);
            }
            return palavraAbreviada.trim();
        }//palavraAbreviada ok

        public void dicionario(String palavraAbreviada, String palavraCompleta){

            dicionarioLista.add(palavraAbreviada+"= "+palavraCompleta);

        }//dicionario

    }//TextoBlog
}