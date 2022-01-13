package way1;

public class Tyre extends Thread{


    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Production of a tyre failed");
            }
            System.out.println("A tyre is produced. ");
        }
    }
}
