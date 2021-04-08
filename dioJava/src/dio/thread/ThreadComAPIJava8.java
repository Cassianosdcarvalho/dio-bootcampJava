package dio.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class ThreadComAPIJava8 {
    // igual metodo run()
    private static final ExecutorService PessoasParaExecutarAtividades = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {

        Casa casa = new Casa (new Quarto());
        List<? extends Future<?>> futuros = casa.obterAfazeresDaCasa().stream().
                map(atividade -> PessoasParaExecutarAtividades.submit(atividade::realizar)).collect(Collectors.toList());
        PessoasParaExecutarAtividades.shutdown();

        while (true){
            int numeroDeAtividadesNaoRealizadas  = 0;
            for (Future<?> futuro : futuros) {
                if (futuro.isDone()){
                        try {
                            System.out.println("parabens vc terminou de "+futuro.get());
                            futuros.remove(futuro);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
    }

class Casa{
    private List<Comodo> comodos;

    Casa(Comodo... comodos) {
     this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAfazeresDaCasa(){
        return  this.comodos.stream().map(Comodo::obterAfazeresDoComodo).reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
            pivo.addAll(atividades);
            return pivo;
        });
    }
}

interface Atividade{
    void realizar();
}

abstract class Comodo{
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo{
    @Override
    List<Atividade> obterAfazeresDoComodo(){

        //esse
        ArrayList<Atividade> afazeres = new ArrayList<>();
        afazeres.add(this::arrumarGuardaRoupa);
        afazeres.add(this::arrumarACama);
        afazeres.add(this::varrerOQuarto);

        //'e igual a esse
        return  Arrays.asList(
                this::arrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa);
        }

    private void arrumarGuardaRoupa(){
        System.out.println("Arrumar o guarda roupa");
    }
    private void varrerOQuarto(){
        System.out.println("Varrer o quarto");
    }
    private void arrumarACama(){
        System.out.println("Arrumar a cama");
    }
}


