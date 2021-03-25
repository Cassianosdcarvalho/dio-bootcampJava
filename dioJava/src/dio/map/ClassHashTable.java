package dio.map;

import com.sun.security.jgss.GSSUtil;

import java.util.Hashtable;
import java.util.Map;

public class ClassHashTable {
    public static void main(String[] args) {

        //suporta concorrencia de threads
        Hashtable<String, Integer> tabela = new Hashtable<>();

        tabela.put("cassiano", 29);
        tabela.put("bruno", 33);
        tabela.put("anderson", 37);
        tabela.put("daliria", 35);

        System.out.println(tabela);

        tabela.remove("daliria");
        System.out.println(tabela);

        int idade = tabela.get("bruno");
        System.out.println(idade);

        System.out.println(tabela.size());

        //navegacao

        for (Map.Entry<String, Integer> indice: tabela.entrySet()) {
            System.out.println(indice.getKey()+" -- "+indice.getValue());
        }

        for (String chave: tabela.keySet()) {
            System.out.println(chave+" --- "+tabela.get(chave));
        }


    }
}
