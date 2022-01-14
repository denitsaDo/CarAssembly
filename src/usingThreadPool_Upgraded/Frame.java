package usingThreadPool_Upgraded;

public class Frame extends Part {
    public Frame() {
        super(CarPartType.FRAME);
        this.threadDelay = 5000;
    }



    @Override
    public void run() {
        try {
            Thread.sleep(getThreadDelay());
        } catch (InterruptedException e) {
            System.out.println("Oops");
        }
        System.out.println("A frame was produced.");
    }


}
