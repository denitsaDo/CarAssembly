package usingThreadPool_Upgraded;

public class Engine extends Part {
    
    public Engine() {

        super(CarPartType.ENGINE);
        this.threadDelay = 7000;
    }

//

    @Override
    public void run() {
        try {
            Thread.sleep(getThreadDelay());
        } catch (InterruptedException e) {
            System.out.println("Oops");
        }
        System.out.println("An engine was produced.");
    }

}
