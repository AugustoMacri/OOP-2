//Depois, escreva uma variante do seu programa que usa sua classe LineCounter para ler arquivos sequencialmente, sem o uso de threads. Compare a performance dos programas,
//usando System.currentTimeMills() para determinar o tempo gasto na execução.
//Compare a performance para 10, 100, 1000 arquivos e escreva suas conclusões (como comentários no código). Liste também as specs da máquina que você usou!

//especificações:
//Processador - Intel(R) Core(TM) i5-8250U CPU @ 1.60GHz   1.80 GHz
//RAM - 8,00 GB
//SSD

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class Main {
    public static void main(String[] args){

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
        double t1 = System.currentTimeMillis();
        for(int i=1; i<=2; i++){
            LineCounter x = new LineCounter(i);
            System.out.println(x.getFile());
            executor.execute(x);
        }
        executor.shutdown();
        double t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        

        double t3 = System.currentTimeMillis();
        LineCounter[] y = new LineCounter[3];
        for(int i=1; i<=2; i++){
            y[i] = new LineCounter(i);
            y[i].LineCounter2();
        }
        double t4 = System.currentTimeMillis();
        System.out.println(t4-t3);

    }
}

//Após repetidas vezes rodando o código, utilizando threads demorou aproximadamente metade do tempo que demoraria para rodar sem threads