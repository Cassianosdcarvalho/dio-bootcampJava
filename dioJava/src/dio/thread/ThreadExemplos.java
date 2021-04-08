package dio.thread;

public class ThreadExemplos {
    public static void main(String[] args) {

        BarraDeCarregamentoB barraDeCarregamentoB = new BarraDeCarregamentoB();
        BarraDeCarregamentoB barraDeCarregamentoB2 = new BarraDeCarregamentoB();

        barraDeCarregamentoB.start();
        barraDeCarregamentoB2.start();

        Thread execucao = new Thread (new BarraDeCarregamento());
        execucao.start();
        System.out.println("classe runnable "+ execucao.getName());

    }

}

class GersrPDF implements Runnable{
    @Override
    public void run(){
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable{
    @Override
   public void run() {
        System.out.println("Loaing ...");
   }
}

class BarraDeCarregamentoB extends Thread{
    @Override
    public  void run(){
        super.run();
        System.out.println("rodei "+this.getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}