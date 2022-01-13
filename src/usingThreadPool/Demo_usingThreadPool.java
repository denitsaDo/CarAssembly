package usingThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo_usingThreadPool {
    public static void main(String[] args) {
        ExecutorService manager = Executors.newFixedThreadPool(3);


        for (int i = 0; i < 4; i++) {
            manager.submit(new Tyre());
        }
        for (int i = 0; i < 5; i++) {
            manager.submit(new Seat());
        }
        manager.submit(new Engine());
        manager.submit(new Frame());

        manager.shutdown();

     
    }
}
