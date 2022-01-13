package usingThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo_usingThreadPool {
    public static void main(String[] args) {
        ExecutorService manager = Executors.newFixedThreadPool(3);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 4; i++) {
            manager.submit(new Tyre());
        }
        for (int i = 0; i < 5; i++) {
            manager.submit(new Seat());
        }
        manager.submit(new Engine());
        manager.submit(new Frame());

        manager.shutdown();

        try {
            manager.awaitTermination(200000, TimeUnit.MILLISECONDS); //тук влизаме, ако работата е свършена или ако времето е достигнало 200000
            long end = System.currentTimeMillis();
            System.out.println("The Car was built for " + ((end - start)/1000) + " seconds");
        } catch (InterruptedException e) {
            System.out.println("What happend");
        }


    }
}
