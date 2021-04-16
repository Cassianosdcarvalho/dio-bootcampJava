package dio.desafios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

import java.util.List;
import java.util.ArrayList;

public class Ajuda {
    public static void main(String[] args) throws IOException {

        List<String>entrada = new ArrayList<>();

        entrada.add("abcdef");
        entrada.add("abc");
        entrada.add("abc");
        entrada.add("abc");

        //insira sua solução aqui

        List<String>textoLista = new ArrayList<>();
        List<String>textoAbreviadoLista = new ArrayList<>();
        List<String>caracteresLista = new ArrayList<>();

        String palavra= "";
        String palavraValida = "";
        String palavraFiltrada ="";


        int cont = 0;


        for (int i = 0; i < entrada.size(); i++) {


            palavra = entrada.get(i).trim();
            palavraValida = validaPalavra(palavra);
            palavraFiltrada = AbreviaNaoAbrevia(palavraValida);

            textoLista.add(palavraValida);
            textoAbreviadoLista.add(palavraFiltrada);

        }//while

        System.out.println(textoLista);
        System.out.println(textoAbreviadoLista);
        System.out.println(cont);
        System.out.println(palavra.length());
        System.out.println(palavraFiltrada);



    }//main

    public static String validaPalavra(String palavra){
        String palavraValida = null;
        if((palavra != null) || (palavra !="") || (palavra != ".")){

            palavraValida = palavra;
        }
        return palavraValida;
    }//validaPalavra


    public static String AbreviaNaoAbrevia(String palavra){
        String  palavraAuxiliar = palavra.charAt(0)+".";

        if(alfabeto(palavra) == true && palavraAuxiliar.length() < palavra.length()){
            return palavraAuxiliar;
        }else{
            return palavra;
        }

    }//AbreviaNaoAbrevia

    public static boolean alfabeto(String palavra){
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


}
