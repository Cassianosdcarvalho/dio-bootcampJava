package dio.carro;

public class Main {
    public static void main(String[] args) {
        Carro mustang = new Carro(10);

        System.out.println(mustang.getQuantPassageiros());

        mustang.setQuantPasssageiros(5);

        System.out.println(mustang.getQuantPassageiros());

    }
}
