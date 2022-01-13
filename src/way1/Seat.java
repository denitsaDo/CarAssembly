package way1;

import java.lang.ref.SoftReference;

public class Seat extends Thread{


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Failed to produce a seat");;
            }

            System.out.println("A seat is produced.");

        }
    }
}
