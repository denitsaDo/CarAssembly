package usingThreadPool_Upgraded;

public class Tyre extends Part {

   
    public Tyre() {
        super(CarPartType.TYRE);
        this.threadDelay = 2000;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(getThreadDelay());
        } catch (InterruptedException e) {
            System.out.println("Oops");
        }
        System.out.println("A tyre was produced.");
    }


}
