package dio.desafios;

import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

public class Ajuda {
    public static void main(String[] args) throws IOException {

        List<String>entrada = new ArrayList<>();

        entrada.add("abcdef");
        entrada.add(".");
        entrada.add("abc");
        entrada.add("abc");
        entrada.add("abc");

        //insira sua solução aqui

        TextoBlog textoBlog = new TextoBlog();
        String palavra= "";
        int cont = 0;

        for (int i = 0; i < entrada.size(); i++) {

            palavra = entrada.get(i).trim();

            var palavraValida = textoBlog.validaPalavra(palavra);

            var palavraAbreviada = textoBlog.palavraAbreviada(palavraValida);

            System.out.println("palavra valida: " +palavraValida);
            System.out.println(palavraAbreviada);
            System.out.println(textoBlog.alfabeto(palavraValida));

        }//while

    }//main

    static class TextoBlog {

        public String validaPalavra(String palavra){
            String palavraValida = palavra.trim();
            if((palavraValida.equals(null)) || (palavraValida.equals("")) || (palavraValida.equals("."))) {
                return palavraValida;
            }else{
                return palavraValida;
            }

        }//validaPalavra


        public String palavraAbreviada(String palavra){
            String palavraAuxiliar = palavra;
            String  palavraAbreviada = palavra.charAt(0)+".";


            if(palavraAbreviada.length() <= palavraAuxiliar.length()){
                return palavraAbreviada;
            }else{
                return palavraAuxiliar;
            }
        }//AbreviaNaoAbrevia

        public boolean alfabeto(String palavra){
            String letra;
            List<String>letras = new ArrayList<>();
            letra = palavra.substring(0,1);

            if(letras.contains(letra)){
                return false;
            }else{
                letras.add(letra);
                return true;
            }

        }//alfabeto

        public String textoCompleto(List lista){
            String texto = "";

            for (Object palavra : lista) {
                texto = texto +" "+ palavra;
            }
            return texto.trim();
        }//textoCompleto

        public List dicionario(String palavraAbreviada, String palavraCompleta){

            List<String>dicinarioLista = new ArrayList<>();

            dicinarioLista.add(palavraAbreviada+"= "+palavraCompleta);

            return  dicinarioLista;
        }//dicionario

    }//TextoBlog
}