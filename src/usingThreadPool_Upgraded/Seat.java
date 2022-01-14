package usingThreadPool_Upgraded;

public class Seat extends Part {


    public Seat() {
        super(CarPartType.SEAT);
        this.threadDelay = 3000;


    }



    @Override
    public void run() {
        try {
            Thread.sleep(getThreadDelay());
        } catch (InterruptedException e) {
            System.out.println("Oops");
        }
        System.out.println("A seat was produced.");
    }


}
