//Implemente o mesmo programa com Thread Pools (ExecutorServices).

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args){

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
       
        for(int i=1; i<=2; i++){
            LineCounter x = new LineCounter(i);
            System.out.println(x.getFile());

            executor.execute(x);
        }
        executor.shutdown();
        
    }
}
