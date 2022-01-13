package usingThreadPool;

public class Frame implements Runnable{
    @Override
    public void run() {
        Frame frame = new Frame();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Failed");
        }
        System.out.println("Frame is produced.");
    }
}
