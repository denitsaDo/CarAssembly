package way1_fastestBuild;

import way1_fastestBuild.parts.Seat;

public class SeatMaker extends Thread{


    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            Seat seat = new Seat();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
