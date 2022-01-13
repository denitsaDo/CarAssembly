package usingThreadPool;

public class Seat implements Runnable{

    @Override
    public void run() {
        Seat seat = new Seat();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Failed");
        }
        System.out.println("Seat is produced.");
    }
}
