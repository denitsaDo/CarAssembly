package way1;

public class EngineAndFrame extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(12000); //7000 + 5000
        } catch (InterruptedException e) {
            System.out.println("Engine production failed");
            System.out.println("Frame production failed");

        }
        System.out.println("Engine and Frame are produced");
    }
}
