package usingThreadPool;

public class Tyre implements Runnable{
    @Override
    public void run() {
        Tyre tyre = new Tyre();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Failed");
        }
        System.out.println("Tyre is produced.");
    }
}
