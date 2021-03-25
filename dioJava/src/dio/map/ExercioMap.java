package dio.map;

import java.util.Map;
import java.util.TreeMap;

public class ExercioMap {

    public static void main(String[] args) {
        TreeMap<String, String> estados = new TreeMap<>();

        estados.put("AM", "Amazonas");
        estados.put("AL", "Alagoas");
        estados.put("MG", "Mina Gerais");
        estados.put("BA", "Bahia");
        estados.put("SP", "Sao Paulo");
        estados.put("SC", "Santa Catarina");
        System.out.println(estados);

        estados.remove("MG");
        System.out.println(estados);

        estados.put("DF", "Disrito Federal");
        System.out.println(estados);

        System.out.println(estados.size());

        estados.remove("BA", "Bahia");
        System.out.println(estados);

        for (Map.Entry<String, String> ler: estados.entrySet()) {
            System.out.println(ler.getValue()+" -- "+ ler.getKey());
        }

        System.out.println(estados.containsKey("SC"));
        System.out.println(estados.containsValue("Maranhao"));

    }
}
