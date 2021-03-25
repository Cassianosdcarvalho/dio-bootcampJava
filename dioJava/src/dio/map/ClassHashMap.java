package dio.map;

import java.util.HashMap;
import java.util.Map;

public class ClassHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesDoMundo = new HashMap<>();//pode ser usado com outros metodos ex. List

        campeoesDoMundo.put("Brasil", 5);
        campeoesDoMundo.put("Alemanha", 4);
        campeoesDoMundo.put("Italia", 4);
        campeoesDoMundo.put("Uruguai", 2);
        campeoesDoMundo.put("Argentina", 2);
        campeoesDoMundo.put("França", 2);
        campeoesDoMundo.put("Ingleterra", 1);
        campeoesDoMundo.put("Espanha", 1);

        System.out.println(campeoesDoMundo);

        campeoesDoMundo.put("Brasil", 6);//atualiza o valor da chave
        System.out.println(campeoesDoMundo);

        System.out.println(campeoesDoMundo.get("Argentina"));//retorna o valor da chave

        System.out.println(campeoesDoMundo.containsKey("França"));//retorna se existe a chave
        System.out.println(campeoesDoMundo.containsValue(6));//retorna se existe o valor

        campeoesDoMundo.remove("Italia");//remove a chave
        System.out.println(campeoesDoMundo);

        //navega nos registros do mapa
        for (Map.Entry<String, Integer> chave: campeoesDoMundo.entrySet()) {
            System.out.println(chave.getKey()+ "---" + chave.getValue());
        }

        //navega nos registros do mapa
        for (String chave: campeoesDoMundo.keySet()){
            System.out.println(chave + "-- " +campeoesDoMundo.get(chave));
        }
    }
}