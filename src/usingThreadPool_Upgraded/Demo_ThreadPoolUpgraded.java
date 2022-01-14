package usingThreadPool_Upgraded;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo_ThreadPoolUpgraded {
    //assemble the car in 12 sec

    public static void main(String[] args) {

        ArrayList<Part> allCarParts = new ArrayList<>();

        allCarParts.add(new Tyre());
        allCarParts.add(new Seat());
        allCarParts.add(new Frame());
        allCarParts.add(new Tyre());
        allCarParts.add(new Seat());
        allCarParts.add(new Tyre());
        allCarParts.add(new Engine());
        allCarParts.add(new Tyre());
        allCarParts.add(new Seat());
        allCarParts.add(new Seat());
        allCarParts.add(new Seat());


        System.out.println(allCarParts.size());
        System.out.println(allCarParts);

// Just produced all parts and now start them in 3 threads.
        ExecutorService manager = Executors.newFixedThreadPool(3);

        long start = System.currentTimeMillis();

        for (Part somePart : allCarParts) {
            manager.submit(somePart);
        }
        manager.shutdown();

        try {
            manager.awaitTermination(200000, TimeUnit.MILLISECONDS); //тук влизаме, ако работата е свършена или ако времето е достигнало 200000
            long end = System.currentTimeMillis();
            System.out.println("The Car was built for " + ((end - start)/1000) + " seconds");
        } catch (InterruptedException e) {
            System.out.println("What happend?");
        }
    }
}
