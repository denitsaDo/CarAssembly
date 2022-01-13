package usingThreadPool;

public class Engine implements Runnable{
    @Override
    public void run() {
        Engine engine = new Engine();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            System.out.println("Failed");
        }
        System.out.println("Engine is produced.");
    }
}
