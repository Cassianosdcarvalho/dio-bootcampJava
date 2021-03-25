package dio.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ClassTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> capitais = new TreeMap<>();//pode ser usado com outros metodos ex. List

        capitais.put("RS", "Posto Alegre");
        capitais.put("SC", "Flopian'opolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "S~ao Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");

        System.out.println(capitais.firstKey());//retorna a primeira cahve
        System.out.println(capitais.lastKey());//retorna a ultima chave
        System.out.println(capitais.lowerKey("SC"));//retorna a primeira chave abaixo do setado
        System.out.println(capitais.higherKey("SC"));//retorna a primeira chave acima do setado

        System.out.println(capitais.containsKey("França"));//retorna se existe a chave
        System.out.println(capitais.containsValue(6));//retorna se existe o valor

       Map.Entry<String, String> removePrimeira = capitais.pollFirstEntry();
       Map.Entry<String, String> removeultima = capitais.pollLastEntry();

        System.out.println(capitais.firstEntry().getKey()+" - "+ capitais.firstEntry().getValue());//retorna a primeira chave e valor
        System.out.println(capitais.lastEntry().getKey()+" - "+ capitais.lastEntry().getValue());//retorna a ultima chave e valor
        System.out.println(capitais.lowerEntry("SP").getKey()+" - "+ capitais.lowerEntry("SP").getValue());//retorna a primeira chave e valor abaixo da setada
        System.out.println(capitais.higherEntry("MG").getKey()+" - "+ capitais.higherEntry("MG").getValue());//retorna a primeira chave e valor acima da setada

        capitais.remove("Italia");//remove a chave
        System.out.println(capitais);

    }
}
