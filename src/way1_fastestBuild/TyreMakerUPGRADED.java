package way1_fastestBuild;

import way1_fastestBuild.parts.Seat;
import way1_fastestBuild.parts.Tyre;

public class TyreMakerUPGRADED extends Thread{


    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            Tyre tyre = new Tyre();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Tyre production failed");
            }
        }

        Seat seat = new Seat();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
