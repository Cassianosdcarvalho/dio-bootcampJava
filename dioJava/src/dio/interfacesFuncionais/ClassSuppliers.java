package dio.interfacesFuncionais;

import java.util.function.Supplier;

public class ClassSuppliers {
    public static void main(String[] args) {

        Supplier<Pessoa> novaPessoaA = () -> new Pessoa();
        Supplier<Pessoa> novaPessoaB = Pessoa::new; //metodo de referencia
        System.out.println(novaPessoaA.get());
        System.out.println(novaPessoaB.get());
    }

}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Cassiano";
        idade = 30;
    }

    @Override
    public String toString(){ //java nao imprime string de classes sem esse metodo
        return String.format("nome : %s, idade: %d",nome,idade);

    }
}
